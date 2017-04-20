package com.seiiti.datamodel.impl;

import com.seiiti.datamodel.FieldData;

public class FieldDataImpl implements FieldData {
  public FieldDataImpl() {}
  
  private String name;
  @Override public String getName() { return this.name; }
  public FieldDataImpl setName(String name) { this.name = name; return this; }
  
  private String getterName;
  @Override public String getGetterName() { return this.getterName; }
  public FieldDataImpl setGetterName(String getterName) { this.getterName = getterName; return this; }
  
  private String setterName;
  @Override public String getSetterName() { return this.setterName; }
  public FieldDataImpl setSetterName(String setterName) { this.setterName = setterName; return this; }
  
  private String type;
  @Override public String getType() { return this.type; }
  public FieldDataImpl setType(String type) { this.type = type; return this; }
}
