package Conversor.View;

import Conversor.ClassesEstruturais.EstruturaCmaismais;
import Conversor.ClassesEstruturais.EstruturaJavaScript;
import Conversor.ClassesTestes.Carro;
import Conversor.ClassesEstruturais.EstruturaPHP;
import Conversor.ClassesEstruturais.EstruturaPython;
import Conversor.ClassesTestes.Pessoa;
import Conversor.Controller.Principal;

/**
 * Classe main de teste
 * @author Cleverton
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro c = new Carro();
       // Pessoa pes = new Pessoa();
       // Principal p = new Principal(pes, new EstruturaPython(), ".py");
        Principal p = new Principal(c, new EstruturaPython(), ".py");
      //  p = new Principal(c, new EstruturaPHP(), ".php");
      //  p = new Principal(c, new EstruturaJavaScript(), ".js");      
      //  p = new Principal(c, new EstruturaCmaismais(), ".cpp");
                
    }
    
}
