package com.rockset.jdbc;

import org.apache.flink.connector.jdbc.dialect.JdbcDialectFactory;

import org.apache.flink.annotation.Internal;
import org.apache.flink.connector.jdbc.dialect.JdbcDialect;

/** Factory for {@link RocksetDialect}. */
@Internal
public class RocksetDialectFactory implements JdbcDialectFactory {
    @Override
    public boolean acceptsURL(String url) {
        return url.startsWith("jdbc:rockset:");
    }

    @Override
    public JdbcDialect create() {
        return new RocksetDialect();
    }
}
