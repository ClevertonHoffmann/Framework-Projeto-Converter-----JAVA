/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Cleverton
 */
public class Teste {
    
    public void cria() throws IOException{
    File f = new File("C:\\Users\\Cleverton\\Desktop\\Teste.php");
       
        f.createNewFile();

	PrintWriter pw = null;

        pw = new PrintWriter(new FileOutputStream(f));

        pw.append("<?php\n");
	pw.append("public class Teste {\n");
	pw.append("public static void main(String... args){\n");
	pw.append("echo(\"File\");\n");
	pw.append("}\n}");
        pw.append("?>");
	
	pw.flush();
	pw.close();
    }
}
