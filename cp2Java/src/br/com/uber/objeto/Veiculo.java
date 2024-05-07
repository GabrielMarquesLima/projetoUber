package br.com.uber.objeto;

public class Veiculo {
    private String placa;
    private String modelo;
    private String montadora;
    private int ano;
    private String cor;
    //Construtores
    public Veiculo(String placa, String modelo, String montadora, int ano, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.montadora = montadora;
        this.ano = ano;
        this.cor = cor;
    }

    public Veiculo() {
    }
    //Métodos acessores
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public int getAno() {
        return ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
