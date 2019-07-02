package Conversor.Persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
/**
 * Persistencia Responsável por criar o documento do Array e selecionar o diretório
 * @author Cleverton
 */
public class Persistencia {
   
    /**
     * MÉTODO RESPONSÁVEL POR CRIAR O DOCUMENTO DE UMA CLASSE
     * @param texto ArrayList 
     * Posicao(0) = Nome da Classe
     * Posicao(1) = Extensão do Arquivo
     * Posicao(2) = String da Classe a ser gerada
     * @return true or false criando o documento
     */
    public boolean cria(ArrayList<String> texto){
        
        File f = new File("".concat(this.returnSelectDirectory()).concat("\\").concat(texto.get(0)).concat(texto.get(1)));
       
        try {
            f.createNewFile();
        } catch (IOException ex) {
            return false;
        }

	PrintWriter pw;
        
        try {
            pw = new PrintWriter(new FileOutputStream(f));
        } catch (FileNotFoundException ex) {
            return false;
        }
        
        pw.append(texto.get(2));
	
	pw.flush();
	pw.close();
        
        return true;
    }
    
    /**
     * ABRE JANELA DE DIRETÓRIO PARA SALVAR
     * @return String do diretório selecionado
     */
    public String returnSelectDirectory(){
        JFileChooser fc = new JFileChooser();

                    // restringe a amostra a diretorios apenas
                    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

                    int res = fc.showOpenDialog(null);

                    if(res == JFileChooser.APPROVE_OPTION){
                        File diretorio = fc.getSelectedFile();
                        return diretorio.getAbsolutePath();
                    }
                    else
                        return " ";
    }
     
    
    
}
