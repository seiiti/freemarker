package com.seiiti.datamodel.impl;

import java.util.List;

import com.seiiti.datamodel.EntityData;
import com.seiiti.datamodel.FieldData;

public class EntityDataImpl implements EntityData {
  public EntityDataImpl() {}
  
  private String packageName;
  @Override public String getPackageName() { return this.packageName; }
  public EntityDataImpl setPackageName(String packageName) { this.packageName = packageName; return this; }
 
  private List<String> importTypes;
  @Override public List<String> getImportTypes() { return this.importTypes; }
  public EntityDataImpl setImportTypes(List<String> importTypes) { this.importTypes = importTypes; return this; }
  
  private String interfaceName;
  @Override public String getInterfaceName() { return this.interfaceName; }
  public EntityDataImpl setInterfaceName(String interfaceName) { this.interfaceName = interfaceName; return this; }
  
  private String className;
  @Override public String getClassName() { return this.className; }
  public EntityDataImpl setClassName(String className) { this.className = className; return this; }
  
  private List<FieldData> fields;
  @Override public List<FieldData> getFields() { return this.fields; }
  public EntityDataImpl setFields(List<FieldData> fields) { this.fields = fields; return this; }
}
