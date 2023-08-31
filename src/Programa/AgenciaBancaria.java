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
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                transferir();
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
    private static Conta encontrarConta(int numeroConta){
        Conta conta = null;
        if(contasBancarias.size() > 0){
            for(Conta c: contasBancarias){
                if (c.getNumeroDaConta() == numeroConta);
                conta = c;
            }
        }
        return conta;
    }


}