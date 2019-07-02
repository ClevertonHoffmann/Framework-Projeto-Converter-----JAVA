/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor.Controller;

import Conversor.ClassesEstruturais.Estructure;
import Conversor.Persistencia.Persistencia;

/**
 * Classe que fabrica as classes de estrutura e 
 * @author Cleverton
 */
public class Factory {
    
    protected Object objeto;
    protected Persistencia persistencia;
    protected Estructure classe;
    
    public Factory(Object obj){
        objeto = obj;
        persistencia = new Persistencia();
    }
    
    public Factory Classe(Estructure classe){
        this.classe = classe;
        return this;
    }
    
}
