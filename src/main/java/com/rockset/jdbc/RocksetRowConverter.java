package com.rockset.jdbc;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.apache.flink.annotation.Internal;
import org.apache.flink.connector.jdbc.converter.AbstractJdbcRowConverter;
import org.apache.flink.table.data.StringData;
import org.apache.flink.table.data.TimestampData;
import org.apache.flink.table.data.DecimalData;
import org.apache.flink.table.types.logical.DecimalType;
import org.apache.flink.table.types.logical.LogicalType;
import org.apache.flink.table.types.logical.RowType;

@Internal
public class RocksetRowConverter extends AbstractJdbcRowConverter {
    @Override
    public String converterName() {
        return "Rockset";
    }

    public RocksetRowConverter(RowType rowType) {
        super(rowType);
    }

    // @Override
    // public RowData toInternal(ResultSet resultSet) throws SQLException {
    // GenericRowData genericRowData = new GenericRowData(rowType.getFieldCount());
    // for (int pos = 0; pos < rowType.getFieldCount(); pos++) {
    // Object field = resultSet.getObject(pos + 1);
    // // TODO do we need anything special for non-string types?
    // String valStr = field.toString();

    // // if valStr is all numbers and can fit in a long, convert to long
    // if (valStr.matches("\\d+") && valStr.length() < 19) {
    // genericRowData.setField(pos, Long.parseLong(valStr));
    // continue;
    // }

    // // if valStr is null then set to null
    // if (valStr.equals("null")) {
    // genericRowData.setField(pos, null);
    // continue;
    // }

    // // Convert string to StringData
    // genericRowData.setField(pos, StringData.fromString(field.toString()));
    // }
    // return genericRowData;
    // }

    @Override
    protected JdbcDeserializationConverter createInternalConverter(LogicalType type) {
        switch (type.getTypeRoot()) {
            case NULL:
                return val -> null;
            case BOOLEAN:
            case INTERVAL_YEAR_MONTH:
            case INTERVAL_DAY_TIME:
                return val -> val;
            case TINYINT:
                return val -> ((Integer) val).byteValue();
            case SMALLINT:
                // Converter for small type that casts value to int and then return short value,
                // since
                // JDBC 1.0 use int type for small values.
                return val -> val instanceof Integer ? ((Integer) val).shortValue() : val;
            case INTEGER:
                return val -> val;
            case BIGINT:
                return val -> val;
            case FLOAT:
                return val -> {
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return null;
                    } else if (val instanceof com.fasterxml.jackson.databind.node.DoubleNode) {
                        return ((com.fasterxml.jackson.databind.node.DoubleNode) val).floatValue();
                    } else if (val instanceof Number) {
                        return ((Number) val).floatValue();
                    } else {
                        throw new UnsupportedOperationException("Unexpected type for FLOAT: " + val.getClass());
                    }
                };
            case DOUBLE:
                return val -> {
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return null;
                    } else if (val instanceof com.fasterxml.jackson.databind.node.DoubleNode) {
                        return ((com.fasterxml.jackson.databind.node.DoubleNode) val).doubleValue();
                    } else if (val instanceof Number) {
                        return ((Number) val).doubleValue();
                    } else {
                        throw new UnsupportedOperationException("Unexpected type for DOUBLE: " + val.getClass());
                    }
                };
            case DECIMAL:
                final int precision = ((DecimalType) type).getPrecision();
                final int scale = ((DecimalType) type).getScale();
                // using decimal(20, 0) to support db type bigint unsigned, user should define
                // decimal(20, 0) in SQL,
                // but other precision like decimal(30, 0) can work too from lenient
                // consideration.
                return val -> val instanceof BigInteger
                        ? DecimalData.fromBigDecimal(
                                new BigDecimal((BigInteger) val, 0), precision, scale)
                        : DecimalData.fromBigDecimal((BigDecimal) val, precision, scale);
            case DATE:
                return val -> (int) (((Date) val).toLocalDate().toEpochDay());
            case TIME_WITHOUT_TIME_ZONE:
                return val -> (int) (((Time) val).toLocalTime().toNanoOfDay() / 1_000_000L);
            case TIMESTAMP_WITH_TIME_ZONE:
            case TIMESTAMP_WITHOUT_TIME_ZONE:
                return val -> val instanceof LocalDateTime
                        ? TimestampData.fromLocalDateTime((LocalDateTime) val)
                        : TimestampData.fromTimestamp((Timestamp) val);
            case CHAR:
            case VARCHAR:
                return val -> StringData.fromString((String) val.toString());
            case BINARY:
            case VARBINARY:
                return val -> val;
            case ARRAY:
            case ROW:
            case MAP:
            case MULTISET:
            case RAW:
            default:
                throw new UnsupportedOperationException("Unsupported type:" + type);
        }
    }
}