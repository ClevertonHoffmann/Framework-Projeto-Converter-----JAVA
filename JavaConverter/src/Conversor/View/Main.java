package Conversor.View;

import Conversor.ClassesTestes.Carro;
import Conversor.ClassesEstruturais.Estructure;
import Conversor.ClassesEstruturais.EstruturaPHP;
import Conversor.Controller.Principal;

/**
 *
 * @author Cleverton
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro c = new Carro();
        Estructure e = new EstruturaPHP();
        Principal p = new Principal(c, e, ".php");
                
    }
    
}
