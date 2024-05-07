package br.com.uber.aplicacao;

import br.com.uber.objeto.Cliente;
import br.com.uber.objeto.Motorista;
import br.com.uber.objeto.Veiculo;
import br.com.uber.objeto.Viagem;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int opcoes;
        int aleatoriedade;
        String clienteFicha = "";
        String motoristaFicha = "";

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Viagem viagem = new Viagem();

        //Instanciando 5 objetos de clientes, c1, c2, c3, c4, c5
        Cliente c1 = new Cliente("Gabriel Marques", "332.223.332-23", "+55 11 99229-2299");
        Cliente c2 = new Cliente("Gabriel Lima", "301.123.123-12", "+55 11 93525-2593");
        Cliente c3 = new Cliente("Cauã Machado", "413-353-234-24", "+55 11 93423-2525");
        Cliente c4 = new Cliente("Elloy Casagrande", "333.333.333-33", "+55 11 99999-9999");
        Cliente c5 = new Cliente("Jay Weinberg", "111.111.111-11", "+55 11 911111-1111");
        //Instanciando 5 veiculos para o motorista
        Veiculo v1 = new Veiculo("HWY1C54", "Corolla", "Toyota", 2023, "Prata");
        Veiculo v2 = new Veiculo("JZX3A28", "Tracker", "Chevrolet", 2018, "Preto");
        Veiculo v3 = new Veiculo("GTP7L39", "Onix", "Chevrolet", 2023, "Branco");
        Veiculo v4 = new Veiculo("RQM8S61", "Ka", "Ford", 2020, "Vermelho");
        Veiculo v5 = new Veiculo("NKV2F85", "Voyage", "Volkswagen", 2020, "Prata");
        //Instanciando 5 motoristas
        Motorista m1 = new Motorista("Vandercleiton", "654.252.569-88", "+55 11 94552-2446", "98273465813", "Black", v1);
        Motorista m2 = new Motorista("Wesley", "235.852.535-33", "+55 11 942342-2346", "15793208471", "Comfort", v2);
        Motorista m3 = new Motorista("Cláudio", "345.628.254-25", "+55 11 99375-2356", "63128905745", "X", v3);
        Motorista m4 = new Motorista("Elías", "347.263.325-23", "+55 11 98295-4444", "70814256390", "X", v4);
        Motorista m5 = new Motorista("Ademilton", "242.146.237-67", "+55 11 99125-2563", "42098375126", "X", v5);

        //iniciando a aplicação
        System.out.println("Olá, seja bem vindo a Uber\nDigite o número equivalente ao usuário que você deseja escolher:\n1:\nNome: " + c1.getNome() + "\nCPF: " + c1.getCpf() + "\nNúmero de celular: " + c1.getCelular() + "\n\n2:\nNome: " + c2.getNome() + "\nCPF: " + c2.getCpf() + "\nNúmero de celular: " + c2.getCelular() + "\n\n3:\nNome: " + c3.getNome() + "\nCPF: " + c3.getCpf() + "\nNúmero de celular: " + c3.getCelular() + "\n\n4:\nNome: " + c4.getNome() + "\nCPF: " + c4.getCpf() + "\nNúmero de celular: " + c4.getCelular() + "\n\n5:\nNome: " + c5.getNome() + "\nCPF: " + c5.getCpf() + "\nNúmero de celular: " + c5.getCelular() + "\nDigite:\n----------------");

        //Escolha de usuário
        opcoes = scanner.nextInt();
        if (opcoes == 1){
            clienteFicha = "Nome: " + c1.getNome() + "\nCPF: " + c1.getCpf() + "\nNúmero de celular: " + c1.getCelular();
        } else if (opcoes == 2){
            clienteFicha = "Nome: " + c2.getNome() + "\nCPF: " + c2.getCpf() + "\nNúmero de celular: " + c2.getCelular();
        } else if (opcoes == 3){
            clienteFicha = "Nome: " + c3.getNome() + "\nCPF: " + c3.getCpf() + "\nNúmero de celular: " + c3.getCelular();
        } else if (opcoes == 4){
            clienteFicha = "Nome: " + c4.getNome() + "\nCPF: " + c4.getCpf() + "\nNúmero de celular: " + c4.getCelular();
        } else if (opcoes == 5){
            clienteFicha = "Nome: " + c5.getNome() + "\nCPF: " + c5.getCpf() + "\nNúmero de celular: " + c5.getCelular();
        } else {
            System.out.println("Por favor, digite uma opção válida:\n1-\n2-\n3-\n4\n5-\nDigite:\n----------------");
        }

        //Pedindo endereço
        viagem.descobrirOrigem();

        viagem.descobrirDestino();

        System.out.println("\nEssa viagem tem quantos KM?\nDigite:\n----------------");
        viagem.setKm(scanner.nextInt());

        //Formas de pagamento
        System.out.println("\nO valor da corrida é de R$ " + viagem.getValor() + "\nQual forma de pagamento? Digite o número equivalente:\n1- Pix\n2- Débito\n3- Crédito\n4- Dinheiro\nDigite:\n----------------");
        viagem.descobrirFormaPagamento();

        //Criando aleatoriedade de escolha de motorista
        aleatoriedade = random.nextInt(5) + 1;
        if (aleatoriedade == 1) {
            motoristaFicha = "O motorista " + m1.getNome() + " está indo até você!\nCarro: " + v1.getModelo() + " " + v1.getMontadora() + " cor: " + v1.getCor() + " Categoria: " + m1.getCategoria() + "\nPlaca: " + v1.getPlaca();
        } else if (aleatoriedade == 2){
            motoristaFicha = "O motorista " + m2.getNome() + " está indo até você!\nCarro: " + v2.getModelo() + " " + v2.getMontadora() + " cor: " + v2.getCor() + " Categoria: " + m2.getCategoria() + "\nPlaca: " + v2.getPlaca();
        } else if (aleatoriedade == 3) {
            motoristaFicha = "O motorista " + m3.getNome() + " está indo até você!\nCarro: " + v3.getModelo() + " " + v3.getMontadora() + " cor: " + v3.getCor() + " Categoria: " + m3.getCategoria() + "\nPlaca: " + v3.getPlaca();
        } else if (aleatoriedade == 4) {
            motoristaFicha = "O motorista " + m4.getNome() + " está indo até você!\nCarro: " + v4.getModelo() + " " + v4.getMontadora() + " cor: " + v4.getCor() + " Categoria: " + m4.getCategoria() + "\nPlaca: " + v4.getPlaca();
        } else {
            motoristaFicha = "O motorista " + m5.getNome() + " está indo até você!\nCarro: " + v5.getModelo() + " " + v5.getMontadora() + " cor: " + v5.getCor() + " Categoria: " + m5.getCategoria() + "\nPlaca: " + v5.getPlaca();
        }

        //Sistema finalizado

        System.out.println("\nPronto!\n" + motoristaFicha + "\nDados:\n" + "Valor pago: " + viagem.getValor() + "\nForma de pagamento: " + viagem.getFormaPagamento() + "\nData: " + viagem.getData() + "\nOrigem: " + viagem.getViagemOrigem() + "\nDestino: " + viagem.getDestino() + "\nDigite:\n----------------");
    }
}