/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor.ClassesEstruturais;

import java.util.ArrayList;

/**
 * Classe responsável pela criação da estrutura de código Python
 * @author Cleverton
 */
public class EstruturaPython implements Estructure{
    @Override
    public String criaClasse(ArrayList<String> a) {
        
        String estrutura;
        //Incializa as variáveis
        estrutura = ("class ".concat(a.get(0)).concat(": \n\n"));
        estrutura = estrutura.concat("      def __init__(self");
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat(",").concat(a.get(i));
            }
        }
        estrutura = estrutura.concat("):\n");
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("              self.").concat(a.get(i)).concat(" = ").concat(a.get(i)).concat("\n");
            }
        }
        //Define os seters    
        estrutura = estrutura.concat("\n");
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("       def set").concat(a.get(i)).concat("(self, ").concat(a.get(i)).concat("):\n");
                estrutura = estrutura.concat("              self.").concat(a.get(i)).concat(" = ").concat(a.get(i)).concat("\n\n");
            }
        }
        //Define os geters 
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("       def get").concat(a.get(i)).concat("(self):\n");
                estrutura = estrutura.concat("              return self.").concat(a.get(i)).concat("\n\n");
            }
        }
        //Implementa o toString
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("       def get").concat(a.get(i)).concat("(self):\n");
                estrutura = estrutura.concat("              return self.").concat(a.get(i)).concat("\n\n");
            }
        }
        
        return estrutura;
    }
}
