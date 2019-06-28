package Conversor.ClassesTestes;

/**
 *
 * @author Cleverton
 */
public class Carro {
    
    private String nome;
    private int ano;
    private String modelo;
    private String marca;
    private String combustivel;
    private Double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro{" + "nome=" + nome + ", ano=" + ano + ", modelo=" + modelo + ", marca=" + marca + ", combustivel=" + combustivel + ", valor=" + valor + '}';
    }
}
