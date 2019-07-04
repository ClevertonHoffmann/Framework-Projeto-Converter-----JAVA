/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Conversor.Controller.Principal;
import Conversor.Persistencia.Persistencia;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cleverton
 */
public final class ClasseTestes {
    
    Principal pr;
    Persistencia p;
    
    public ClasseTestes() {
        
    }
        
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     /**
      * Classe que testa o texto salvo no arquivo de texto determinado
      * @throws IOException 
      */
     @Test
     public void TesteTextoArquivoSalvar() throws IOException {
         p = new Persistencia();
         ArrayList<String> texto = new ArrayList();
         texto.add("TESTE");
         texto.add(".php");
         texto.add("TESTE");
         assertEquals(p.cria(texto), true);
        try {
            FileReader r = new FileReader(p.returnSelectDirectory().concat("\\TESTE").concat(texto.get(1)));
            BufferedReader lerArq = new BufferedReader(r);
            assertEquals(lerArq.readLine(), "TESTE");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClasseTestes.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
}
