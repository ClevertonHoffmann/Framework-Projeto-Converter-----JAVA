package Conversor.ClassesEstruturais;

import java.util.ArrayList;

/**
 * Classe responsável pela criação da estrutura de código PHP
 * @author Cleverton
 */
public class EstruturaPHP implements Estructure {

    @Override
    /**
     * Método que retorna string da estrutura da classe PHP
     */
    public String criaClasse(ArrayList<String> a) {

        String estrutura;
        estrutura = ("<?php \n\n");
        estrutura = estrutura.concat("class ".concat(a.get(0)).concat("{ \n\n"));
        //Monta o construtor da classe
        estrutura = estrutura.concat("function _construct() {\n\n}\n");
        //Monta as variáveis
        for (int i = 1; i < a.size(); i++) {
            if (i % 2 != 0) {
                estrutura = estrutura.concat("  private $").concat(a.get(i)).concat("; \n");
            }
        }
        estrutura = estrutura.concat("\n");
        //Monta os geters
        for (int i = 1; i < a.size(); i++) {
            if (i % 2 != 0) {
                estrutura = estrutura.concat("public function get").concat(a.get(i).concat("() \n{\n"));
                estrutura = estrutura.concat("  return $this->").concat(a.get(i).concat(";\n} \n\n"));
            }
        }
        //Monta os seter
        for (int i = 1; i < a.size(); i++) {
            if (i % 2 != 0) {
                estrutura = estrutura.concat("public function set").concat(a.get(i).concat("($").concat(a.get(i)).concat(") \n{\n"));
                estrutura = estrutura.concat("  $this->").concat(a.get(i).concat(" = $").concat(a.get(i)).concat(";\n} \n\n"));
            }
        }
        //Monta o toString()    
        estrutura = estrutura.concat("\n");
        estrutura = estrutura.concat("function __toString() {\n");
        estrutura = estrutura.concat("return \"").concat(a.get(0)).concat(": {\".");
        for (int i = 1; i < a.size(); i++) {
            if (i % 2 != 0) {
                if (i == 1) {
                    estrutura = estrutura.concat("\"").concat(a.get(i)).concat(": \".get").concat(a.get(i)).concat("()");
                } else {
                    estrutura = estrutura.concat(".\"").concat(a.get(i)).concat(": \".get").concat(a.get(i)).concat("()");
                }
            }
        }
        estrutura = estrutura.concat(".\"}\";");
        estrutura = estrutura.concat("\n}\n");
        estrutura = estrutura.concat("}\n?>");
        return estrutura;
    }

}
