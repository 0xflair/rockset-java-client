package com.rockset.jdbc;

import org.apache.flink.annotation.Internal;
import org.apache.flink.connector.jdbc.converter.JdbcRowConverter;
import org.apache.flink.table.types.logical.LogicalTypeRoot;
import org.apache.flink.connector.jdbc.dialect.AbstractDialect;
import org.apache.flink.table.types.logical.RowType;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Internal
public class RocksetDialect extends AbstractDialect {

    private static final long serialVersionUID = 1L;

    // Define MAX/MIN precision of TIMESTAMP type according to Mysql docs:
    // https://dev.mysql.com/doc/refman/8.0/en/fractional-seconds.html
    private static final int MAX_TIMESTAMP_PRECISION = 6;
    private static final int MIN_TIMESTAMP_PRECISION = 0;

    // Define MAX/MIN precision of DECIMAL type according to Mysql docs:
    // https://dev.mysql.com/doc/refman/8.0/en/fixed-point-types.html
    private static final int MAX_DECIMAL_PRECISION = 65;
    private static final int MIN_DECIMAL_PRECISION = 1;

    @Override
    public JdbcRowConverter getRowConverter(RowType rowType) {
        return new RocksetRowConverter(rowType);
    }

    @Override
    public String getLimitClause(long limit) {
        return "LIMIT " + limit;
    }

    @Override
    public Optional<String> defaultDriverName() {
        return Optional.of("com.rockset.jdbc.RocksetDriver");
    }

    @Override
    public String quoteIdentifier(String identifier) {
        return "`" + identifier + "`";
    }

    @Override
    public Optional<String> getUpsertStatement(
            String tableName, String[] fieldNames, String[] uniqueKeyFields) {
        String updateClause = Arrays.stream(fieldNames)
                .map(f -> quoteIdentifier(f) + "=VALUES(" + quoteIdentifier(f) + ")")
                .collect(Collectors.joining(", "));
        return Optional.of(
                getInsertIntoStatement(tableName, fieldNames)
                        + " ON DUPLICATE KEY UPDATE "
                        + updateClause);
    }

    /**
     * A simple {@code SELECT} statement.
     *
     * <pre>{@code
     * SELECT expression [, ...]
     * FROM table_name
     * WHERE cond [AND ...]
     * }</pre>
     */
    @Override
    public String getSelectFromStatement(
            String tableName, String[] selectFields, String[] conditionFields) {
        String selectExpressions = Arrays.stream(selectFields)
                .map(this::quoteIdentifier)
                .collect(Collectors.joining(", "));

        if (tableName.contains(":")) {
            String[] parts = tableName.split(":");
            String namespace = parts[0];
            String entityType = parts[1];

            String fieldExpressions = Arrays.stream(conditionFields)
                    .map(f -> String.format("%s = :%s", quoteIdentifier(f), f))
                    .collect(Collectors.joining(" AND "));

            String sql = "SELECT "
                    + selectExpressions
                    + " FROM "
                    + quoteIdentifier("entities")
                    + (conditionFields.length > 0
                            ? " WHERE namespace = '" + namespace + "' AND entityType = '" + entityType + "' AND ("
                                    + fieldExpressions + ")"
                            : " WHERE namespace = '" + namespace + "' AND entityType = '" + entityType + "'");

            System.out.println("getSelectFromStatement SQL: " + sql);

            return sql;
        } else {
            String fieldExpressions = Arrays.stream(conditionFields)
                    .map(f -> String.format("%s = :%s", quoteIdentifier(f), f))
                    .collect(Collectors.joining(" AND "));

            String sql = "SELECT "
                    + selectExpressions
                    + " FROM "
                    + quoteIdentifier(tableName)
                    + (conditionFields.length > 0
                            ? " WHERE " + fieldExpressions
                            : "");

            System.out.println("getSelectFromStatement SQL: " + sql);

            return sql;
        }
    }

    @Override
    public String dialectName() {
        return "Rockset";
    }

    @Override
    public Optional<Range> decimalPrecisionRange() {
        return Optional.of(Range.of(MIN_DECIMAL_PRECISION, MAX_DECIMAL_PRECISION));
    }

    @Override
    public Optional<Range> timestampPrecisionRange() {
        return Optional.of(Range.of(MIN_TIMESTAMP_PRECISION, MAX_TIMESTAMP_PRECISION));
    }

    @Override
    public Set<LogicalTypeRoot> supportedTypes() {
        return EnumSet.of(
                LogicalTypeRoot.CHAR,
                LogicalTypeRoot.VARCHAR,
                LogicalTypeRoot.BOOLEAN,
                LogicalTypeRoot.VARBINARY,
                LogicalTypeRoot.DECIMAL,
                LogicalTypeRoot.TINYINT,
                LogicalTypeRoot.SMALLINT,
                LogicalTypeRoot.INTEGER,
                LogicalTypeRoot.BIGINT,
                LogicalTypeRoot.FLOAT,
                LogicalTypeRoot.DOUBLE,
                LogicalTypeRoot.DATE,
                LogicalTypeRoot.NULL,
                LogicalTypeRoot.TIME_WITHOUT_TIME_ZONE,
                LogicalTypeRoot.TIMESTAMP_WITHOUT_TIME_ZONE);
    }
}