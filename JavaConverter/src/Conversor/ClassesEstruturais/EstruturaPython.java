package Conversor.ClassesEstruturais;

import java.util.ArrayList;

/**
 * Classe responsável pela criação da estrutura de código Python
 * @author Cleverton
 */
public class EstruturaPython implements Estructure{
    @Override
    /**
     * Método que retorna string da estrutura da classe Python
     */
    public String criaClasse(ArrayList<String> a) {
        
        String estrutura;
        //Incializa as variáveis
        estrutura = ("class ".concat(a.get(0)).concat(": \n\n"));
        estrutura = estrutura.concat("       def __init__(self");
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
        //Monta o toString()    
        estrutura = estrutura.concat("       def __repr__(self):\n");
        estrutura = estrutura.concat("              return \"").concat(a.get(0)).concat("");
        estrutura = estrutura.concat("{\"");
        for (int i = 1; i<a.size(); i++){
            if(i%2!=0){
                if(i==1){
                    estrutura = estrutura.concat("+").concat("\"").concat(a.get(i)).concat(":\"").concat("+str(self.").concat(a.get(i));
                }else{
                    estrutura = estrutura.concat(")+").concat("\";").concat(a.get(i)).concat(":\"").concat("+str(self.").concat(a.get(i));    
                }
            }
        }
        estrutura = estrutura.concat(")+\"}\"");
        
        return estrutura;
    }
}
