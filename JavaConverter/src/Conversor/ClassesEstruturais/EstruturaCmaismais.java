package Conversor.ClassesEstruturais;

import java.util.ArrayList;

/**
 * Classe responsável pela criação da estrutura de código C++
 * @author Cleverton
 */
public class EstruturaCmaismais implements Estructure{
    @Override
    /**
     * Método que retorna string da estrutura da classe C++
     */
    public String criaClasse(ArrayList<String> a) {
        
        String estrutura;
        estrutura = ("#include <iostream> \n"); 
        estrutura = estrutura.concat("#include <string>  // Necessário para usar strings\n"); 
        estrutura = estrutura.concat("using namespace std;\n\n"); 
        estrutura = estrutura.concat("class ".concat(a.get(0)).concat("{ \n\n"));
        estrutura = estrutura.concat("private: \n");
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("      ").concat(a.get(i+1).toLowerCase()).concat(" ").concat(a.get(i)).concat("; \n");
            }
        }
        estrutura = estrutura.concat("\n");
        
        //Monta os geters
        estrutura = estrutura.concat("public: \n");
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("      ").concat(a.get(i+1).toLowerCase()).concat(" get").concat(a.get(i).concat("() \n      {\n"));
                estrutura = estrutura.concat("             return ").concat(a.get(i).concat(";\n      } \n\n"));
            }
        }
        //Monta os seter
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("      void set").concat(a.get(i)).concat("(").
                        concat(a.get(i+1).toLowerCase()).concat(" _").concat(a.get(i)).concat(") \n      {\n");
                estrutura = estrutura.concat("             ").concat(a.get(i).concat(" = _").concat(a.get(i)).concat(";\n      } \n\n"));
            }
        }
        
        estrutura = estrutura.concat("\n\n      ");
        //Monta o toString()       
        estrutura = estrutura.concat("string ").concat(" toString() {\n");
        estrutura = estrutura.concat("             return ");
        estrutura = estrutura.concat("\"").concat(a.get(0)).concat("{");
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                if(i==1){
                    estrutura = estrutura.concat(a.get(i)).concat(":\" +"); 
                    if(a.get(i+1).equals("String")){
                        estrutura = estrutura.concat("(").concat(a.get(i)).concat(")");
                    }else{
                        estrutura = estrutura.concat("to_string(").concat(a.get(i)).concat(")");
                    }
                }else{
                estrutura = estrutura.concat("\n             +").concat("\";").concat(a.get(i)).concat(":\" +");
                if(a.get(i+1).equals("String")){
                        estrutura = estrutura.concat("(").concat(a.get(i)).concat(")");
                    }else{
                        estrutura = estrutura.concat("to_string(").concat(a.get(i)).concat(")");
                    }
                }
            }
        } 
        estrutura = estrutura.concat("+\"}\";");
        estrutura = estrutura.concat("}\n");
        estrutura = estrutura.concat("};\n");
        return estrutura;
    }
}
