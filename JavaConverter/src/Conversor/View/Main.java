package Conversor.View;

import Conversor.ClassesParametroJava.Carro;
import Conversor.ClassesEstruturais.*;
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
       // System.out.print(c);
        
      //  Pessoa pes = new Pessoa();
       Principal p = new Principal(c, new EstruturaPython(), ".py");
      // Principal p = new Principal(c, new EstruturaJavaScript(), ".js");
      //  p = new Principal(c, new EstruturaPHP(), ".php");
      //  p = new Principal(c, new EstruturaJavaScript(), ".js");      
     // Principal p = new Principal(c, new EstruturaCmaismais(), ".cpp");
    //  Principal p = new Principal(c, new EstruturaPHP(), ".php");
    }
    
}
