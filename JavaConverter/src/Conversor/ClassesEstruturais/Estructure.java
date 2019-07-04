package Conversor.ClassesEstruturais;

import java.util.ArrayList;

/**
 * Interface Responsável por fornecer dados 
 * para a criação da estrutura de classe 
 * em cada linguagem específica
 * @author Cleverton
 */
public interface Estructure {
    
    /**
     * Método a ser implementado para a geração do código em qualquer linguagem
     * @param lista com:
     * Nome da Classe;
     * Nome de cada Atributo;
     * Tipo de dados de cada atributo;
     * @return String da estrutura da classe
     */
    public String criaClasse(ArrayList<String> lista);
    
}
