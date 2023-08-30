package Programa;

import Utilitarios.Utils;

public class Conta {
    private static int contadorConta = 1;

    private int numeroDaConta;
    private Client client;
    private Double saldo = 0.0;

    public Conta(Client client) {
        this.numeroDaConta = contadorConta;
        this.client = client;
        //contador cada vez q for criado uma conta
        contadorConta += 1;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return "\nNumero da conta: " + this.getNumeroDaConta() +
                "\nNome: " + this.client.getNome() +
                "\nCPF: " + this.client.getCpf() +
                "\nEmail: " + this.client.getEmail() +
                "\nSaldo " + Utils.doubleToString(this.getSaldo()) +
                "\n";
    }

// metodos deposita

    public void depositar(Double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("Seu deposito foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar o depósito!");
        }
    }

//metodo sacar

    public void sacar(Double valor){
        if (valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!!");
        } else {
            System.out.println("Não foi possível realizar o saque!");
        }
    }

//metodo transferir

    public void transferir(Conta contaParaDeposito, Double valor){
        if (valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);

            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência!");
        }
    }




}
