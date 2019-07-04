/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor.ClassesEstruturais;

import java.util.ArrayList;

/**
 *
 * @author Cleverton
 */
public class EstruturaCmaismais implements Estructure{
    @Override
    public String criaClasse(ArrayList<String> a) {
        
        String estrutura;
        estrutura = ("#include <iostream.h>  \n\n"); 
        estrutura = estrutura.concat("class ".concat(a.get(0)).concat("{ \n\n"));
        estrutura = estrutura.concat("private: \n");
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("      ").concat(a.get(i+1)).concat(" ").concat(a.get(i)).concat("; \n");
            }
        }
        estrutura = estrutura.concat("\n");
        
        //Monta os geters
        estrutura = estrutura.concat("public: \n");
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("      ").concat(a.get(i+1)).concat(" get").concat(a.get(i).concat("() \n      {\n"));
                estrutura = estrutura.concat("             return ").concat(a.get(i).concat(";\n      } \n\n"));
            }
        }
        //Monta os seter
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("      void set").concat(a.get(i)).concat("(").
                        concat(a.get(i+1)).concat(" ").concat(a.get(i)).concat(") \n      {\n");
                estrutura = estrutura.concat("             this->").concat(a.get(i).concat(" = ").concat(a.get(i)).concat(";\n      } \n\n"));
            }
        }
        
        estrutura = estrutura.concat("\n\n");
               
        estrutura = estrutura.concat("string ").concat(a.get(0)).concat(" ::toString() {\n");
        estrutura = estrutura.concat("      std::string texto = ");
        estrutura = estrutura.concat("\"").concat(a.get(0)).concat("{\"+");
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                if(i==1){
                    estrutura = estrutura.concat("\"").concat(a.get(i)).concat(":\" + std::to_string(").concat(" this->get").concat(a.get(i)).concat("())");
                }
                estrutura = estrutura.concat("\n      +").concat("\"").concat(a.get(i)).concat(":\" + std::to_string(").concat(" this->get").concat(a.get(i)).concat("())");
            }
        } 
        estrutura = estrutura.concat("+\"}\"\n");
        estrutura = estrutura.concat("}\n");
        return estrutura;
    }
}
