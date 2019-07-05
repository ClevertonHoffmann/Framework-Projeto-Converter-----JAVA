package Conversor.ClassesTestes;

import java.util.Date;

/**
 * Classe pessoa teste
 * @author Cleverton
 */
public class Pessoa {
    
    private int telefone;
    private double peso;
    private String nome;
    private int idade;
    private String endereco;
    private Date nascimento;

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }   
    
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "telefone=" + telefone + ", peso=" + peso + ", nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + '}';
    }
    
}
