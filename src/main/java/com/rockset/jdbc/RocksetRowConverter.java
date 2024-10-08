package com.rockset.jdbc;

import java.math.BigInteger;

import static java.lang.String.format;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.apache.flink.annotation.Internal;
import org.apache.flink.connector.jdbc.converter.AbstractJdbcRowConverter;
import org.apache.flink.table.data.StringData;
import org.apache.flink.table.data.TimestampData;
import org.apache.flink.table.data.DecimalData;
import org.apache.flink.table.data.GenericRowData;
import org.apache.flink.table.data.RowData;
import org.apache.flink.table.types.logical.DecimalType;
import org.apache.flink.table.types.logical.LogicalType;
import org.apache.flink.table.types.logical.RowType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Internal
public class RocksetRowConverter extends AbstractJdbcRowConverter {
    private static final Logger LOG = LoggerFactory.getLogger(RocksetDriver.class);

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
    // String columnName = ((RocksetResultSet)
    // resultSet).getMetaData().getColumnName(pos + 1);
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
    public RowData toInternal(ResultSet resultSet) throws SQLException {
        // try {
        //     // Print out the row data with field positions, field names and values:
        //     // RocksetDriver.log("RocksetRowConverter RowData.toInternal resultSet: " +
        //     //         resultSet.toString());
        //     for (int pos = 0; pos < rowType.getFieldCount(); pos++) {
        //         LogicalType tp = this.rowType.getTypeAt(pos);
        //         // RocksetDriver.log("RocksetRowConverter RowData.toInternal resultSet field: "
        //         //         + pos + " "
        //         //         + rowType.getFieldNames().get(pos) + " " + resultSet.getObject(pos +
        //         //                 1).toString()
        //         //         + " logical type " + tp.asSerializableString());
        //     }
        // } catch (Exception e) {
        //     RocksetDriver.log("RocksetRowConverter RowData.toInternal resultSet exception: " + e.toString());
        // }

        GenericRowData genericRowData = new GenericRowData(rowType.getFieldCount());

        for (int pos = 0; pos < rowType.getFieldCount(); pos++) {
            Object fieldValue = resultSet.getObject(pos + 1);
            String fieldName = rowType.getFieldNames().get(pos);
            int actualPos = (((RocksetResultSet) resultSet).findColumn(fieldName)) - 1;

            // RocksetDriver.log("RocksetRowConverter RowData.toInternal loop: pos=" + pos + " fieldName=" + fieldName
            //         + " actualPos=" + actualPos + " fieldValue=" + fieldValue.toString());

            genericRowData.setField(actualPos, toInternalConverters[pos].deserialize(fieldValue));
        }

        // try {
        //     // Print out the row data with field positions, field names and values:
            // RocksetDriver.log("Fetched row from database " +
            //         genericRowData.toString());
            if (LOG.isDebugEnabled()) {
                String fieldValues = "";
                for (int pos = 0; pos < rowType.getFieldCount(); pos++) {
                    fieldValues +=    " [" + rowType.getFieldNames().get(pos) + "]=AttributeValue(" + this.getFieldValue(genericRowData, pos) + ")";
                }
                LOG.debug("Fetched row from database " + fieldValues);
            }
        // } catch (Exception e) {
        //     RocksetDriver.log("RocksetRowConverter RowData.toInternal genericRowData exception: " +
        //             e.toString());
        // }

        return genericRowData;
    }

    // @Override
    public RowData toInternalX(ResultSet resultSet) throws SQLException {
        RowData data = super.toInternal(resultSet);

        try {
            // Print out the row data with field positions, field names and values:
            // RocksetDriver.log("RocksetRowConverter RowData.toInternal resultSet: " +
            //         resultSet.toString());
            for (int pos = 0; pos < rowType.getFieldCount(); pos++) {
                LogicalType tp = this.rowType.getTypeAt(pos);
                RocksetDriver.log("RocksetRowConverter RowData.toInternal resultSet field: "
                        + pos + " "
                        + rowType.getFieldNames().get(pos) + " " + resultSet.getObject(pos +
                                1).toString()
                        + " logical type " + tp.asSerializableString());
            }
        } catch (Exception e) {
            RocksetDriver.log("RocksetRowConverter RowData.toInternal resultSet exception: " + e.toString());
        }

        try {
            // Print out the row data with field positions, field names and values:
            RocksetDriver.log("RocksetRowConverter RowData.toInternal data: " +
                    data.toString());
            for (int pos = 0; pos < rowType.getFieldCount(); pos++) {
                RocksetDriver.log("RocksetRowConverter RowData.toInternal data field: " + pos
                        + " "
                        + rowType.getFieldNames().get(pos) + " " + this.getFieldValue(data, pos));
            }
        } catch (Exception e) {
            RocksetDriver.log("RocksetRowConverter RowData.toInternal data exception: " +
                    e.toString());
        }

        return data;
    }

    private String getFieldValue(RowData data, int pos) {
        try {
            return data.getString(pos).toString();
        } catch (Exception e) {
            try {
                return new Long(data.getLong(pos)).toString();
            } catch (Exception e2) {
                try {
                    return new Double(data.getDouble(pos)).toString();
                } catch (Exception e3) {
                    try {
                        return new Boolean(data.getBoolean(pos)).toString();
                    } catch (Exception e4) {
                        try {
                            return data.getDecimal(pos, 18, 18).toString();
                        } catch (Exception e5) {
                            try {
                                return new Timestamp(data.getTimestamp(pos, 6).getMillisecond()).toString();
                            } catch (Exception e6) {
                                try {
                                    return new Date(data.getInt(pos)).toString();
                                } catch (Exception e7) {
                                    try {
                                        return new Time(data.getInt(pos)).toString();
                                    } catch (Exception e8) {
                                        try {
                                            return new Float(data.getFloat(pos)).toString();
                                        } catch (Exception e9) {
                                            return "Unknown field type at pos " + pos + " " + e9.toString();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    protected JdbcDeserializationConverter createInternalConverter(LogicalType type) {
        switch (type.getTypeRoot()) {
            case NULL:
                return val -> null;
            case BOOLEAN:
                return val -> {
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return false;
                    } else if (val instanceof com.fasterxml.jackson.databind.node.ValueNode) {
                        return ((com.fasterxml.jackson.databind.node.ValueNode) val).booleanValue();
                    } else if (val instanceof Boolean) {
                        return val;
                    } else {
                        throw new UnsupportedOperationException("Unexpected type for BOOLEAN: " + val.getClass());
                    }
                };
            case INTERVAL_YEAR_MONTH:
            case INTERVAL_DAY_TIME:
                return val -> val;
            case TINYINT:
                return val -> {
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return null;
                    }
                    
                    return ((Integer) val).byteValue();
                };
            case SMALLINT:
                // Converter for small type that casts value to int and then return short value,
                // since
                // JDBC 1.0 use int type for small values.
                return val -> val instanceof Integer ? ((Integer) val).shortValue() : val;
            case INTEGER:
                return val -> {
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return null;
                    } else if (val instanceof com.fasterxml.jackson.databind.node.ValueNode) {
                        return ((com.fasterxml.jackson.databind.node.ValueNode) val).intValue();
                    } else if (val instanceof Number) {
                        return ((Number) val).intValue();
                    } else {
                        throw new UnsupportedOperationException("Unexpected type for INTEGER: " + val.getClass());
                    }
                };
            case BIGINT:
                return val -> {
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return null;
                    } else if (val instanceof com.fasterxml.jackson.databind.node.ValueNode) {
                        return ((com.fasterxml.jackson.databind.node.ValueNode) val).longValue();
                    } else if (val instanceof Number) {
                        return ((Number) val).longValue();
                    } else {
                        throw new UnsupportedOperationException("Unexpected type for BIGINT: " + val.getClass());
                    }
                };
            case FLOAT:
                return val -> {
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return null;
                    } else if (val instanceof com.fasterxml.jackson.databind.node.ValueNode) {
                        return ((com.fasterxml.jackson.databind.node.ValueNode) val).floatValue();
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
                    } else if (val instanceof com.fasterxml.jackson.databind.node.ValueNode) {
                        return ((com.fasterxml.jackson.databind.node.ValueNode) val).doubleValue();
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
                return val -> {
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return null;
                    } else if (val instanceof com.fasterxml.jackson.databind.node.ValueNode) {
                        return DecimalData.fromBigDecimal(
                                ((com.fasterxml.jackson.databind.node.ValueNode) val).decimalValue(),
                                precision, scale);
                    } else if (val instanceof BigInteger) {
                        return DecimalData.fromBigDecimal(new BigDecimal((BigInteger) val, 0), precision, scale);
                    } else {
                        throw new UnsupportedOperationException("Unexpected type for DECIMAL: " + val.getClass());
                    }
                };
            // val instanceof BigInteger
            // ? DecimalData.fromBigDecimal(
            // new BigDecimal((BigInteger) val, 0), precision, scale)
            // : DecimalData.fromBigDecimal((BigDecimal) val, precision, scale);
            case DATE:
                return val -> {
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return null;
                    }

                    return (int) (((Date) val).toLocalDate().toEpochDay());
                };
            case TIME_WITHOUT_TIME_ZONE:
                return val -> {
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return null;
                    }
                    
                    return (int) (((Time) val).toLocalTime().toNanoOfDay() / 1_000_000L);
                };
            case TIMESTAMP_WITH_TIME_ZONE:
            case TIMESTAMP_WITHOUT_TIME_ZONE:
                return val -> {
                    // TODO convert Rockset dates or unix timestamps to TimestampData
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return null;
                    }
                    // else if (val instanceof com.fasterxml.jackson.databind.node.ValueNode) {
                    // return ((com.fasterxml.jackson.databind.node.ValueNode) val).
                    // } else {
                    return val instanceof LocalDateTime
                            ? TimestampData.fromLocalDateTime((LocalDateTime) val)
                            : TimestampData.fromTimestamp((Timestamp) val);
                    // }
                };
            case CHAR:
            case VARCHAR:
                return val -> {
                    if (val == null || val instanceof com.fasterxml.jackson.databind.node.NullNode) {
                        return null;
                    } else if (val instanceof com.fasterxml.jackson.databind.node.ValueNode) {
                        return StringData
                                .fromString((String) ((com.fasterxml.jackson.databind.node.ValueNode) val).asText());
                    } else {
                        return StringData.fromString((String) val.toString());
                    }
                };
            case BINARY:
            case VARBINARY:
                return val -> val;
            case RAW:
            // TODO 
            case ROW:
            case ARRAY:
            case MAP:
            case MULTISET:
            default:
                throw new UnsupportedOperationException("Unsupported type:" + type);
        }
    }
}