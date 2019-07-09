package Conversor.ClassesEstruturais;

import java.util.ArrayList;

/**
 * Classe responsável pela criação da estrutura de código JavaScript
 * @author Cleverton
 */
public class EstruturaJavaScript implements Estructure{
    @Override
    /**
     * Método que retorna string da estrutura da classe JavaScript
     */
    public String criaClasse(ArrayList<String> a) {
        
        String estrutura;
        //Incializa a classe
        estrutura = ("var ".concat(a.get(0)).concat(" = (function (){\n"));
        //Construtor
        estrutura = estrutura.concat("      function ").concat(a.get(0)).concat("(){\n");
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("           if(this.").concat(a.get(i)).concat(" === undefined)\n");
                estrutura = estrutura.concat("                this.").concat(a.get(i)).concat(" = null; \n");
            }
        }
        estrutura = estrutura.concat("      }\n\n");    
        
        //Monta os geters e seters
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                estrutura = estrutura.concat("      ").concat(a.get(0)).concat(".prototype.get").concat(a.get(i)).concat("= function() {\n");
                estrutura = estrutura.concat("          return this.").concat(a.get(i).concat(";\n      };\n"));
                estrutura = estrutura.concat("      ").concat(a.get(0)).concat(".prototype.set").concat(a.get(i)).concat(" ").concat("= function(").concat(a.get(i)).concat(") {\n");
                estrutura = estrutura.concat("          this.").concat(a.get(i)).concat(" = ").concat(a.get(i)).concat(";\n      }; \n");
            }
        }
        estrutura = estrutura.concat("\n\n");
        
        //Monta o método toString()
        estrutura = estrutura.concat(a.get(0)).concat(".prototype.toString").concat(" = function() {\n");
        estrutura = estrutura.concat("return \"").concat(a.get(0)).concat(": {\"+");
        for (int i = 1; i < a.size(); i++) {
            if (i % 2 != 0) {
                if (i == 1) {
                    estrutura = estrutura.concat("\"").concat(a.get(i)).concat("= \"+this.").concat(a.get(i));
                } else {
                    estrutura = estrutura.concat("+\",").concat(a.get(i)).concat("= \"+this.").concat(a.get(i));
                }
            }
        }
        estrutura = estrutura.concat("+\"}\";");
        estrutura = estrutura.concat("\n};\n");
        estrutura = estrutura.concat("return ").concat(a.get(0)).concat(";\n");
        estrutura = estrutura.concat("}());\n\n");
        estrutura = estrutura.concat(a.get(0)).concat("[\"__class\"] = ").concat("\"").concat(a.get(0)).concat("\";");
        return estrutura;
    }
}
