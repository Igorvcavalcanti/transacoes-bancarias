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
                "\nSaldo " + Utils.doubleToString(this.getSaldo());
    }
}
