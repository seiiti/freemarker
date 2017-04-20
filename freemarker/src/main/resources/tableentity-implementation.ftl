<#ftl strip_whitespace=true strip_text=true>

<@main/>

<#----------------------------------------------------------------------------------------------------------------------
  MACRO: main
----------------------------------------------------------------------------------------------------------------------->

<#macro main>
package ${packageName};

<#list importTypes as t>
import ${t};
</#list>

public class ${className} implements ${interfaceName} {
  public ${className}() {}
  <#list fields as f>
  
  private ${f.type} ${f.name};
  @Override public ${f.type} ${f.getterName}() { return this.${f.name}; }
  @Override public ${className} ${f.setterName}(${f.type} ${f.name}) { this.${f.name} = ${f.name}; return this; }
  </#list>
}
</#macro>
