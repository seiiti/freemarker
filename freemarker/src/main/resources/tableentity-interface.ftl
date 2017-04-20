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

public interface ${interfaceName} {
  <#list fields as f>
  ${f.type} ${f.getterName}();
  ${interfaceName} ${f.setterName}(${f.type} ${f.name});
  
  </#list>
}
</#macro>
