package Conversor.View;

import Conversor.ClassesTestes.Carro;
import Conversor.ClassesEstruturais.Estructure;
import Conversor.ClassesEstruturais.EstruturaPython;
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
        Estructure e = new EstruturaPython();
        Principal p = new Principal(c, e, ".py");
                
    }
    
}
