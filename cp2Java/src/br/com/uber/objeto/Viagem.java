package br.com.uber.objeto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Viagem {
    private LocalDateTime dataHoraAtual = LocalDateTime.now();
    private DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private String data = dataHoraAtual.format(formatado);
    private double valor;
    private String viagemOrigem;
    private String destino;
    private int km;
    private String formaPagamento;
    private int opcoes;
    Scanner scanner = new Scanner(System.in);

    public Viagem() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor = km * 2.50;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getViagemOrigem() {
        return viagemOrigem;
    }

    public void setViagemOrigem(String viagemOrigem) {
        this.viagemOrigem = viagemOrigem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(int opcoes) {
        this.opcoes = opcoes;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String descobrirFormaPagamento() {
        opcoes = scanner.nextInt();
        if (opcoes == 1) {
            formaPagamento = "Pix";
        } else if (opcoes == 2) {
            formaPagamento = "Débito";
        } else if (opcoes == 3) {
            formaPagamento = "Crédito";
        } else if (opcoes == 4) {
            formaPagamento = "Dinheiro";
        } else {
            System.out.println("Insira uma opção válida");
        }
        return formaPagamento;
    }

    public String descobrirOrigem (){
        System.out.println("\nAonde devemos ir te buscar?");
        viagemOrigem = scanner.nextLine();
        return viagemOrigem;
    }

    public String descobrirDestino (){
        System.out.println("\nQual o local de destino?");
        destino = scanner.nextLine();
        return destino;
    }

}
