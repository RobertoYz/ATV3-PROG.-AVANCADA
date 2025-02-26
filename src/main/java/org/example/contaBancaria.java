package org.example;

public abstract class contaBancaria{
    protected int numeroConta;
    protected String titular;
    protected double saldo;

    public contaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double valor){
        return saldo = saldo + valor;
    }

    public abstract double sacar(double valor);

    public void exibirInformacoes() {
        System.out.println("contaBancaria{" +
                "numeroConta=" + numeroConta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}');
    }
}
