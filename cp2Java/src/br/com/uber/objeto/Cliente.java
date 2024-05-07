package br.com.uber.objeto;

public class Cliente {
    private String cliente;
    private String nome;
    private String cpf;
    private String celular;

    public Cliente(String nome, String cpf, String celular) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
    }
    public Cliente() {

    }
    //métodos acessores
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
