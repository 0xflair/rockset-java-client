package com.rockset.jdbc;

import static com.google.common.base.Strings.nullToEmpty;
import static java.lang.Integer.parseInt;

import com.google.common.base.Throwables;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RocksetDriver implements Driver, Closeable {
  private static final Logger LOG = LoggerFactory.getLogger(RocksetDriver.class);

  static final String DRIVER_NAME = "Rockset JDBC Driver";
  static final String DRIVER_VERSION;
  static final int DRIVER_VERSION_MAJOR;
  static final int DRIVER_VERSION_MINOR;

  public static final String JDBC_URL_START = "jdbc:";
  private static final String ROCKSET_DRIVER_URL_START = JDBC_URL_START.concat("rockset:");

  // // This is debug logging to trace the calls made to the rockset jdbc driver.
  // // if env var LOG_LEVEL is set to DEBUG, then the logs will be written to a file
  // public static boolean debugLogs = System.getenv("LOG_LEVEL") != null
  //      && System.getenv("LOG_LEVEL").equalsIgnoreCase("DEBUG");
       
  private static BufferedWriter debugWriter;
  private static String logfile = "/tmp/rockset-jdbc.log";

  static {
    String version = nullToEmpty(RocksetDriver.class.getPackage().getImplementationVersion());
    Matcher matcher = Pattern.compile("^(\\d+)\\.(\\d+)($|[.-])").matcher(version);
    if (!matcher.find()) {
      DRIVER_VERSION = "unknown";
      DRIVER_VERSION_MAJOR = 0;
      DRIVER_VERSION_MINOR = 0;
    } else {
      DRIVER_VERSION = version;
      DRIVER_VERSION_MAJOR = parseInt(matcher.group(1));
      DRIVER_VERSION_MINOR = parseInt(matcher.group(2));
    }

    try {
      DriverManager.registerDriver(new RocksetDriver());
    } catch (SQLException e) {
      throw Throwables.propagate(e);
    }
  }

  @Override
  public void close() {
    // dunno what to do here
  }

  @Override
  public Connection connect(String url, Properties info) throws SQLException {
    // log("Entry: Connect " + url);
    if (!acceptsURL(url)) {
      // log("Exit: Connect bad url" + url);
      // JDBC expects null return if url cannot be supported by driver:
      // "The driver should return "null" if it realizes it is the wrong kind of driver to connect
      // to the given URL"
      // https://docs.oracle.com/javase/7/docs/api/java/sql/Driver.html#connect(java.lang.String,%20java.util.Properties)
      return null;
    }

    URI uri = null;
    try {
      uri = new URI(url);
    } catch (URISyntaxException e) {
      throw new SQLException("Bad url format " + url + " exception", e);
    }

    // create a connection to the rockset service
    RocksetConnection conn = new RocksetConnection(uri, info);

    // Make a SELECT 1 query to validate that credentials are good.
    // This allows a client to early detect any potential problems with apikey
    // and authentication.
    Statement stmt = conn.createStatement();
    ResultSet res = stmt.executeQuery("select 1");
    res.close();
    stmt.close();

    // log("Exit: Connect " + url);
    return conn;
  }

  @Override
  public boolean acceptsURL(String url) throws SQLException {
    // log("Entry: acceptsURL " + url);
    return url.startsWith(ROCKSET_DRIVER_URL_START);
  }

  @Override
  public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
    // log("Entry: getPropertyInfo " + url);
    Properties properties = new RocksetDriverUri(url, info).getProperties();

    return ConnectionProperties.allProperties().stream()
        .map(property -> property.getDriverPropertyInfo(properties))
        .toArray(DriverPropertyInfo[]::new);
  }

  @Override
  public int getMajorVersion() {
    // log("Entry: getMajorVersion ");
    return DRIVER_VERSION_MAJOR;
  }

  @Override
  public int getMinorVersion() {
    // log("Entry: getMinorVersion ");
    return DRIVER_VERSION_MINOR;
  }

  @Override
  public boolean jdbcCompliant() {
    // log("Entry: jdbcCompliant ");
    return true;
  }

  @Override
  public java.util.logging.Logger getParentLogger() throws SQLFeatureNotSupportedException {
    throw new SQLFeatureNotSupportedException();
  }

  // helper method to write log to a specific file
  public static void log(String msg) {
    LOG.debug(msg);
  }
}
