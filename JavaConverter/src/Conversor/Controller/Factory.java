package Conversor.Controller;

import Conversor.ClassesEstruturais.Estructure;
import Conversor.Persistencia.Persistencia;

/**
 * Classe que fabrica as classes de persistencia e classe estrutural bem como armazena o objeto
 * @author Cleverton
 */
public class Factory {
    
    protected Object objeto;
    protected Persistencia persistencia;
    protected Estructure classe;
    /**
     * Método responsável por inicializar a persistencia e preencher o objeto
     * @param obj Objeto
     */
    public Factory(Object obj){
        objeto = obj;
        persistencia = new Persistencia();
    }
    /**
     * Classe responsável por 
     * @param classe
     * @return Factory
     */
    public Factory Classe(Estructure classe){
        this.classe = classe;
        return this;
    }
    
}
