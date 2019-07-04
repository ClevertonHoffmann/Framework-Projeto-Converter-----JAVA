package Conversor.Controller;

import Conversor.ClassesEstruturais.Estructure;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Classe principal da Frame a ser Instanciada
 * @author Cleverton
 */
public class Principal {
        
    private Factory  f;
    private String extensao;
    /**
     * Contrutor da classe principal
     * @param obj Classe em Java
     * @param e Arquivo de Configuração da Linguagem
     * @param ext Extensão do arquivo da Linguagem a ser gerada a classe
     */
    public Principal(Object obj, Estructure e, String ext){
        f = new Factory(obj).Classe(e);
        extensao = ext;
        this.CriaClasse();
    }
    
    /**
     * RETORNA ARRAY DE STRING DO NOME DA CLASSE E DOS ATRIBUTOS E SEUS TIPOS
     * @param object
     * @return String de atributos e seus tipos com o nome da classe na primeira posição
     */
    public ArrayList<String> retornaArrayAtributosObjeto(Object object){
        Class<?> classe = object.getClass();      
        Field[] campos = classe.getDeclaredFields();        
        ArrayList<String> valores = new ArrayList<>();
        valores.add(object.getClass().getSimpleName());//Nome da Classe
        for (Field campo : campos) {     
            //Pega o nome do atributo
            valores.add(campo.getName()); 
            //Pega o tipo do atributo
            valores.add(campo.getAnnotatedType().getType().getTypeName().replaceAll("java.lang.", "")); 
        }
        int k=0;
        for(String a: valores){
            if(a.equals("Double")){
                valores.set(k, "double");
            }
            k++;
        }
        return valores;
    }
    
    /**
     * Classe principal responsável por trabalhar com os métodos para criar classe dos objetos
     */
    private void CriaClasse(){
        ArrayList<String> valores = this.retornaArrayAtributosObjeto(f.objeto);
        String estrutura = f.classe.criaClasse(valores);
        String nome = valores.get(0);
        valores.clear();
        valores.add(nome);
        valores.add(extensao);
        valores.add(estrutura);
        f.persistencia.cria(valores);     
    }
    
}
