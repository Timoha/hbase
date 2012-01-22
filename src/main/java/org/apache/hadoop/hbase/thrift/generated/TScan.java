/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A Scan object is used to specify scanner parameters when opening a scanner.
 */
public class TScan implements org.apache.thrift.TBase<TScan, TScan._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TScan");

  private static final org.apache.thrift.protocol.TField START_ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("startRow", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STOP_ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("stopRow", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField CACHING_FIELD_DESC = new org.apache.thrift.protocol.TField("caching", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField FILTER_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("filterString", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TScanStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TScanTupleSchemeFactory());
  }

  public ByteBuffer startRow; // optional
  public ByteBuffer stopRow; // optional
  public long timestamp; // optional
  public List<ByteBuffer> columns; // optional
  public int caching; // optional
  public ByteBuffer filterString; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START_ROW((short)1, "startRow"),
    STOP_ROW((short)2, "stopRow"),
    TIMESTAMP((short)3, "timestamp"),
    COLUMNS((short)4, "columns"),
    CACHING((short)5, "caching"),
    FILTER_STRING((short)6, "filterString");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // START_ROW
          return START_ROW;
        case 2: // STOP_ROW
          return STOP_ROW;
        case 3: // TIMESTAMP
          return TIMESTAMP;
        case 4: // COLUMNS
          return COLUMNS;
        case 5: // CACHING
          return CACHING;
        case 6: // FILTER_STRING
          return FILTER_STRING;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private static final int __CACHING_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  private _Fields optionals[] = {_Fields.START_ROW,_Fields.STOP_ROW,_Fields.TIMESTAMP,_Fields.COLUMNS,_Fields.CACHING,_Fields.FILTER_STRING};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_ROW, new org.apache.thrift.meta_data.FieldMetaData("startRow", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.STOP_ROW, new org.apache.thrift.meta_data.FieldMetaData("stopRow", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "Text"))));
    tmpMap.put(_Fields.CACHING, new org.apache.thrift.meta_data.FieldMetaData("caching", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FILTER_STRING, new org.apache.thrift.meta_data.FieldMetaData("filterString", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TScan.class, metaDataMap);
  }

  public TScan() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TScan(TScan other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetStartRow()) {
      this.startRow = other.startRow;
    }
    if (other.isSetStopRow()) {
      this.stopRow = other.stopRow;
    }
    this.timestamp = other.timestamp;
    if (other.isSetColumns()) {
      List<ByteBuffer> __this__columns = new ArrayList<ByteBuffer>();
      for (ByteBuffer other_element : other.columns) {
        __this__columns.add(other_element);
      }
      this.columns = __this__columns;
    }
    this.caching = other.caching;
    if (other.isSetFilterString()) {
      this.filterString = other.filterString;
    }
  }

  public TScan deepCopy() {
    return new TScan(this);
  }

  @Override
  public void clear() {
    this.startRow = null;
    this.stopRow = null;
    setTimestampIsSet(false);
    this.timestamp = 0;
    this.columns = null;
    setCachingIsSet(false);
    this.caching = 0;
    this.filterString = null;
  }

  public byte[] getStartRow() {
    setStartRow(org.apache.thrift.TBaseHelper.rightSize(startRow));
    return startRow == null ? null : startRow.array();
  }

  public ByteBuffer bufferForStartRow() {
    return startRow;
  }

  public TScan setStartRow(byte[] startRow) {
    setStartRow(startRow == null ? (ByteBuffer)null : ByteBuffer.wrap(startRow));
    return this;
  }

  public TScan setStartRow(ByteBuffer startRow) {
    this.startRow = startRow;
    return this;
  }

  public void unsetStartRow() {
    this.startRow = null;
  }

  /** Returns true if field startRow is set (has been assigned a value) and false otherwise */
  public boolean isSetStartRow() {
    return this.startRow != null;
  }

  public void setStartRowIsSet(boolean value) {
    if (!value) {
      this.startRow = null;
    }
  }

  public byte[] getStopRow() {
    setStopRow(org.apache.thrift.TBaseHelper.rightSize(stopRow));
    return stopRow == null ? null : stopRow.array();
  }

  public ByteBuffer bufferForStopRow() {
    return stopRow;
  }

  public TScan setStopRow(byte[] stopRow) {
    setStopRow(stopRow == null ? (ByteBuffer)null : ByteBuffer.wrap(stopRow));
    return this;
  }

  public TScan setStopRow(ByteBuffer stopRow) {
    this.stopRow = stopRow;
    return this;
  }

  public void unsetStopRow() {
    this.stopRow = null;
  }

  /** Returns true if field stopRow is set (has been assigned a value) and false otherwise */
  public boolean isSetStopRow() {
    return this.stopRow != null;
  }

  public void setStopRowIsSet(boolean value) {
    if (!value) {
      this.stopRow = null;
    }
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public TScan setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bit_vector.clear(__TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return __isset_bit_vector.get(__TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bit_vector.set(__TIMESTAMP_ISSET_ID, value);
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<ByteBuffer> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(ByteBuffer elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<ByteBuffer>();
    }
    this.columns.add(elem);
  }

  public List<ByteBuffer> getColumns() {
    return this.columns;
  }

  public TScan setColumns(List<ByteBuffer> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getCaching() {
    return this.caching;
  }

  public TScan setCaching(int caching) {
    this.caching = caching;
    setCachingIsSet(true);
    return this;
  }

  public void unsetCaching() {
    __isset_bit_vector.clear(__CACHING_ISSET_ID);
  }

  /** Returns true if field caching is set (has been assigned a value) and false otherwise */
  public boolean isSetCaching() {
    return __isset_bit_vector.get(__CACHING_ISSET_ID);
  }

  public void setCachingIsSet(boolean value) {
    __isset_bit_vector.set(__CACHING_ISSET_ID, value);
  }

  public byte[] getFilterString() {
    setFilterString(org.apache.thrift.TBaseHelper.rightSize(filterString));
    return filterString == null ? null : filterString.array();
  }

  public ByteBuffer bufferForFilterString() {
    return filterString;
  }

  public TScan setFilterString(byte[] filterString) {
    setFilterString(filterString == null ? (ByteBuffer)null : ByteBuffer.wrap(filterString));
    return this;
  }

  public TScan setFilterString(ByteBuffer filterString) {
    this.filterString = filterString;
    return this;
  }

  public void unsetFilterString() {
    this.filterString = null;
  }

  /** Returns true if field filterString is set (has been assigned a value) and false otherwise */
  public boolean isSetFilterString() {
    return this.filterString != null;
  }

  public void setFilterStringIsSet(boolean value) {
    if (!value) {
      this.filterString = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_ROW:
      if (value == null) {
        unsetStartRow();
      } else {
        setStartRow((ByteBuffer)value);
      }
      break;

    case STOP_ROW:
      if (value == null) {
        unsetStopRow();
      } else {
        setStopRow((ByteBuffer)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<ByteBuffer>)value);
      }
      break;

    case CACHING:
      if (value == null) {
        unsetCaching();
      } else {
        setCaching((Integer)value);
      }
      break;

    case FILTER_STRING:
      if (value == null) {
        unsetFilterString();
      } else {
        setFilterString((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_ROW:
      return getStartRow();

    case STOP_ROW:
      return getStopRow();

    case TIMESTAMP:
      return Long.valueOf(getTimestamp());

    case COLUMNS:
      return getColumns();

    case CACHING:
      return Integer.valueOf(getCaching());

    case FILTER_STRING:
      return getFilterString();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START_ROW:
      return isSetStartRow();
    case STOP_ROW:
      return isSetStopRow();
    case TIMESTAMP:
      return isSetTimestamp();
    case COLUMNS:
      return isSetColumns();
    case CACHING:
      return isSetCaching();
    case FILTER_STRING:
      return isSetFilterString();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TScan)
      return this.equals((TScan)that);
    return false;
  }

  public boolean equals(TScan that) {
    if (that == null)
      return false;

    boolean this_present_startRow = true && this.isSetStartRow();
    boolean that_present_startRow = true && that.isSetStartRow();
    if (this_present_startRow || that_present_startRow) {
      if (!(this_present_startRow && that_present_startRow))
        return false;
      if (!this.startRow.equals(that.startRow))
        return false;
    }

    boolean this_present_stopRow = true && this.isSetStopRow();
    boolean that_present_stopRow = true && that.isSetStopRow();
    if (this_present_stopRow || that_present_stopRow) {
      if (!(this_present_stopRow && that_present_stopRow))
        return false;
      if (!this.stopRow.equals(that.stopRow))
        return false;
    }

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_caching = true && this.isSetCaching();
    boolean that_present_caching = true && that.isSetCaching();
    if (this_present_caching || that_present_caching) {
      if (!(this_present_caching && that_present_caching))
        return false;
      if (this.caching != that.caching)
        return false;
    }

    boolean this_present_filterString = true && this.isSetFilterString();
    boolean that_present_filterString = true && that.isSetFilterString();
    if (this_present_filterString || that_present_filterString) {
      if (!(this_present_filterString && that_present_filterString))
        return false;
      if (!this.filterString.equals(that.filterString))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TScan other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TScan typedOther = (TScan)other;

    lastComparison = Boolean.valueOf(isSetStartRow()).compareTo(typedOther.isSetStartRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startRow, typedOther.startRow);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStopRow()).compareTo(typedOther.isSetStopRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStopRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stopRow, typedOther.stopRow);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(typedOther.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, typedOther.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(typedOther.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, typedOther.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCaching()).compareTo(typedOther.isSetCaching());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCaching()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.caching, typedOther.caching);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilterString()).compareTo(typedOther.isSetFilterString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilterString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filterString, typedOther.filterString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TScan(");
    boolean first = true;

    if (isSetStartRow()) {
      sb.append("startRow:");
      if (this.startRow == null) {
        sb.append("null");
      } else {
        sb.append(this.startRow);
      }
      first = false;
    }
    if (isSetStopRow()) {
      if (!first) sb.append(", ");
      sb.append("stopRow:");
      if (this.stopRow == null) {
        sb.append("null");
      } else {
        sb.append(this.stopRow);
      }
      first = false;
    }
    if (isSetTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("timestamp:");
      sb.append(this.timestamp);
      first = false;
    }
    if (isSetColumns()) {
      if (!first) sb.append(", ");
      sb.append("columns:");
      if (this.columns == null) {
        sb.append("null");
      } else {
        sb.append(this.columns);
      }
      first = false;
    }
    if (isSetCaching()) {
      if (!first) sb.append(", ");
      sb.append("caching:");
      sb.append(this.caching);
      first = false;
    }
    if (isSetFilterString()) {
      if (!first) sb.append(", ");
      sb.append("filterString:");
      if (this.filterString == null) {
        sb.append("null");
      } else {
        sb.append(this.filterString);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TScanStandardSchemeFactory implements SchemeFactory {
    public TScanStandardScheme getScheme() {
      return new TScanStandardScheme();
    }
  }

  private static class TScanStandardScheme extends StandardScheme<TScan> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TScan struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.startRow = iprot.readBinary();
              struct.setStartRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STOP_ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stopRow = iprot.readBinary();
              struct.setStopRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                struct.columns = new ArrayList<ByteBuffer>(_list18.size);
                for (int _i19 = 0; _i19 < _list18.size; ++_i19)
                {
                  ByteBuffer _elem20; // required
                  _elem20 = iprot.readBinary();
                  struct.columns.add(_elem20);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CACHING
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.caching = iprot.readI32();
              struct.setCachingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // FILTER_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.filterString = iprot.readBinary();
              struct.setFilterStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TScan struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.startRow != null) {
        if (struct.isSetStartRow()) {
          oprot.writeFieldBegin(START_ROW_FIELD_DESC);
          oprot.writeBinary(struct.startRow);
          oprot.writeFieldEnd();
        }
      }
      if (struct.stopRow != null) {
        if (struct.isSetStopRow()) {
          oprot.writeFieldBegin(STOP_ROW_FIELD_DESC);
          oprot.writeBinary(struct.stopRow);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTimestamp()) {
        oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.timestamp);
        oprot.writeFieldEnd();
      }
      if (struct.columns != null) {
        if (struct.isSetColumns()) {
          oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.columns.size()));
            for (ByteBuffer _iter21 : struct.columns)
            {
              oprot.writeBinary(_iter21);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCaching()) {
        oprot.writeFieldBegin(CACHING_FIELD_DESC);
        oprot.writeI32(struct.caching);
        oprot.writeFieldEnd();
      }
      if (struct.filterString != null) {
        if (struct.isSetFilterString()) {
          oprot.writeFieldBegin(FILTER_STRING_FIELD_DESC);
          oprot.writeBinary(struct.filterString);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TScanTupleSchemeFactory implements SchemeFactory {
    public TScanTupleScheme getScheme() {
      return new TScanTupleScheme();
    }
  }

  private static class TScanTupleScheme extends TupleScheme<TScan> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TScan struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStartRow()) {
        optionals.set(0);
      }
      if (struct.isSetStopRow()) {
        optionals.set(1);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(2);
      }
      if (struct.isSetColumns()) {
        optionals.set(3);
      }
      if (struct.isSetCaching()) {
        optionals.set(4);
      }
      if (struct.isSetFilterString()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetStartRow()) {
        oprot.writeBinary(struct.startRow);
      }
      if (struct.isSetStopRow()) {
        oprot.writeBinary(struct.stopRow);
      }
      if (struct.isSetTimestamp()) {
        oprot.writeI64(struct.timestamp);
      }
      if (struct.isSetColumns()) {
        {
          oprot.writeI32(struct.columns.size());
          for (ByteBuffer _iter22 : struct.columns)
          {
            oprot.writeBinary(_iter22);
          }
        }
      }
      if (struct.isSetCaching()) {
        oprot.writeI32(struct.caching);
      }
      if (struct.isSetFilterString()) {
        oprot.writeBinary(struct.filterString);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TScan struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.startRow = iprot.readBinary();
        struct.setStartRowIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stopRow = iprot.readBinary();
        struct.setStopRowIsSet(true);
      }
      if (incoming.get(2)) {
        struct.timestamp = iprot.readI64();
        struct.setTimestampIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.columns = new ArrayList<ByteBuffer>(_list23.size);
          for (int _i24 = 0; _i24 < _list23.size; ++_i24)
          {
            ByteBuffer _elem25; // required
            _elem25 = iprot.readBinary();
            struct.columns.add(_elem25);
          }
        }
        struct.setColumnsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.caching = iprot.readI32();
        struct.setCachingIsSet(true);
      }
      if (incoming.get(5)) {
        struct.filterString = iprot.readBinary();
        struct.setFilterStringIsSet(true);
      }
    }
  }

}

