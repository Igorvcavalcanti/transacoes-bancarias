package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes(){

        System.out.println("----------------------------------------------------");
        System.out.println("-----------Bem vindos a nossa agencia---------------");
        System.out.println("----------------------------------------------------");
        System.out.println("*****Selecione uma operação que deseja realizar*****");
        System.out.println("----------------------------------------------------");
        System.out.println("|   Opção 1 - Criar conta    |");
        System.out.println("|   Opção 2 - Depositar      |");
        System.out.println("|   Opção 3 - Sacar          |");
        System.out.println("|   Opção 4 - Transferir     |");
        System.out.println("|   Opção 5 - Listar         |");
        System.out.println("|   Opção 6 - Sair           |");

        int operacao = input.nextInt();

        switch (operacao){
            case 1:
                criarConta();
                break;
            case 2:
                deposito();
                break;
            case 3:
                saque();
                break;
            case 4:
                transferencia();
                break;
            case 5:
                listar();
                break;
            case 6:
                System.out.println("Obrigado por usr nossa agência!!");
                System.out.println("Você saiu!");
                System.exit(0);
            default:
                System.out.println("Opção inválida");
                operacoes();
                break;
        }
    }


// metodo para criar conta
    public static void criarConta() {
        System.out.println("\nNome: ");
        String nome = input.next();

        System.out.println("\nCPF: ");
        String cpf = input.next();

        System.out.println("\nEmail: ");
        String email = input.next();

        Client client = new Client(nome , cpf, email);
        Conta conta = new Conta(client);
        contasBancarias.add(conta);

        System.out.println("conta criada com sucesso!");
        operacoes();
    }


// metodo para encontrar conta existente
    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if (contasBancarias.size() > 0) {
            for (Conta c : contasBancarias) {
                if (c.getNumeroDaConta() == numeroConta){
                    conta = c;
                }
            }
        }
        return conta;
    }

// metodo deposito
    public static void deposito(){
        System.out.println("Numero da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta != null){
            System.out.println("Qual valor deseja depositar? ");
            Double valorDeposito = input.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("Valor depositado com sucesso!");
        } else {
            System.out.println("Conta não encontrada!");
        }
        operacoes();
    }


// metodo saque
    public static void saque(){
        System.out.println("Numero da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta != null){
            System.out.println("Qual valor deseja sacar? ");
            Double valorSaque= input.nextDouble();
            conta.sacar(valorSaque);
        } else {
            System.out.println("Conta não encontrada!");
        }
        operacoes();
    }


// metodo transferencia
    public static void transferencia(){
        System.out.println("Numero da conta do remetente: ");
        int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if(contaRemetente != null){
            System.out.println("Numero da conta destinatario: ");
            int numeroContaDestinatario = input.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if (contaDestinatario != null){
                System.out.println("Valor da transferência: ");
                Double valor = input.nextDouble();

                contaRemetente.transferir(contaDestinatario, valor);
            } else {
                System.out.println("A conta para depósito não foi encontrada");
            }
        } else {
            System.out.println("Conta para transferencia não encontrada");
        }
        operacoes();
    }

// metodo listar contas
    public static void listar(){
        if (contasBancarias.size() > 0){
            for(Conta conta: contasBancarias){
                System.out.println(conta);
            }
            }else {
                System.out.println("Não há contas cadastradas");
        }
    }
}