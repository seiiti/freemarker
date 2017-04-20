package com.seiiti.freemarker;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.text.WordUtils;

import com.seiiti.datamodel.EntityData;
import com.seiiti.datamodel.FieldData;
import com.seiiti.datamodel.impl.FieldDataImpl;

public class EntityDataImpl implements EntityData {
  public EntityDataImpl() {}
  
  private String packageName;
  @Override public String getPackageName() { return this.packageName; }
  public EntityDataImpl setPackageName(String packageName) { this.packageName = packageName; return this; }
  
  private String interfaceName;
  @Override public String getInterfaceName() { return this.interfaceName; }
  public EntityDataImpl setInterfaceName(String interfaceName) { this.interfaceName = interfaceName; return this; }
  
  private final List<FieldData> fields = new ArrayList<>();
  @Override public List<FieldData> getFields() { return this.fields; }
  
  @Override
  public String getClassName() {
    return String.format( "%sImpl", this.interfaceName );
  }
  
  private final TreeSet<String> importTypes = new TreeSet<>();
  @Override public Set<String> getImportTypes() { return this.importTypes; }
  
  public EntityDataImpl addField(String name, Class<?> type) {
    String getterName = String.format( "get%s", WordUtils.capitalize( name ) );
    String setterName = String.format( "set%s", WordUtils.capitalize( name ) );
    
    String typeName = type.getSimpleName();
    
    if( needsImport( type ) )
      this.importTypes.add( type.getName() );
    
    FieldDataImpl fieldData = new FieldDataImpl()
      .setName       ( name       )
      .setGetterName ( getterName )
      .setSetterName ( setterName )
      .setType       ( typeName   );
    
    this.fields.add( fieldData );
    
    return this;
  }
  
  private boolean needsImport(Class<?> type) {
    if( type == String.class )
      return false;
    
    if( type == Integer.class )
      return false;
    
    return true;
  }
}
