package com.seiiti.datamodel;

import java.util.Collection;

public interface EntityData {
  String                getPackageName   ();
  Collection<String>    getImportTypes   ();
  String                getInterfaceName ();
  String                getClassName     ();
  Collection<FieldData> getFields        ();
}
