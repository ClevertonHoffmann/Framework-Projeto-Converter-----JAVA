package Conversor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cleverton
 */
public class ConvertePHP {
    
    private Object  objeto;
    
    public ConvertePHP(Object obj){
        objeto = obj;
    }
    
    public ConvertePHP(){
        
    }
   
    public boolean cria(){
        
        File f = new File("C:\\Users\\Cleverton\\Desktop\\Teste.php");
       
        try {
            f.createNewFile();
        } catch (IOException ex) {
            return false;
        }

	PrintWriter pw;
        try {
            pw = new PrintWriter(new FileOutputStream(f));
        } catch (FileNotFoundException ex) {
            return false;
        }

        
        
        pw.append("<?php\n");
	pw.append("public class Teste {\n");
	pw.append("public static void main(String... args){\n");
	pw.append("echo(\"File\");\n");
	pw.append("}\n}");
        pw.append("?>");
	
	pw.flush();
	pw.close();
        
        return true;
    }
    
     public void imprimeAtributoseValoresPojo(Object object){
        Class<?> classe = object.getClass();      
        Field[] campos = classe.getDeclaredFields();        
        
        String nomeAtributo = "";
        Object valorAtributo = null;        
        for (Field campo : campos) {            
            try {               
                nomeAtributo = campo.getName();
                campo.setAccessible(true); //Necessário por conta do encapsulamento das variáveis (private)
                valorAtributo = campo.get(object);                              
            } catch (Exception e) {
                e.printStackTrace();
            }           
            System.out.println(nomeAtributo + ": " + valorAtributo);            
        }       
    }
    
}
