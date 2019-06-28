/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author Cleverton
 */
public class ConfiguracaoPadrao {
    
    ConfiguracaoPadrao(){
        
    }
    
    
    /**
     * RETORNA ARRAY DE STRING DOS ATRIBUTOS E NOME DO OBJETO
     * @param object
     * @return String de atributos com o nome da classe na primeira posição
     */
    public ArrayList<String> retornaArrayAtributosObjeto(Object object){
        Class<?> classe = object.getClass();      
        Field[] campos = classe.getDeclaredFields();        
        ArrayList<String> nomeAtributo = new ArrayList<>();
        nomeAtributo.add(object.getClass().getSimpleName());      
        for (Field campo : campos) {                          
            nomeAtributo.add(campo.getName());  
        }       
        return nomeAtributo;
    }
    
    
}
