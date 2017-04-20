package com.seiiti.freemarker;

import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.Date;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class Sample {
  public static final String templatesPath    = "src/main/resources"             ;
  public static final String templateFileName = "tableentity-implementation.ftl" ;
  
  public static void main(String[] args) throws Exception {
    File dir = new File( templatesPath );
    
    Configuration cfg = new Configuration( Configuration.VERSION_2_3_26 );
    
    cfg. setDirectoryForTemplateLoading ( dir     );
    cfg. setDefaultEncoding             ( "UTF-8" );
    cfg. setTemplateExceptionHandler    ( TemplateExceptionHandler.RETHROW_HANDLER );
    
    OutputStream out = System.out;
    OutputStreamWriter writer = new OutputStreamWriter( out );
    
    Template template = cfg.getTemplate( templateFileName );
    template.process( getDataModel(), writer );
  }
  
  public static Object getDataModel() {
    return new com.seiiti.freemarker.EntityDataImpl()
      .setPackageName   ( "com.seiiti.db.entities"    )
      .setInterfaceName ( "Aplicacao"                 )
      .addField         ( "id"    , Integer    .class )
      .addField         ( "nome"  , String     .class )
      .addField         ( "data"  , Date       .class )
      .addField         ( "valor" , BigDecimal .class );
  }
}
