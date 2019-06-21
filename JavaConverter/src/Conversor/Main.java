package Conversor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Cleverton
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Carro c = new Carro();
        ConvertePHP t = new ConvertePHP(c);
       // t.cria();
                     
        t.imprimeAtributoseValoresPojo(c); 
        
    }
    
}
