package org.example;

public class contaPoupanca extends contaBancaria{
    public contaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        if(valor <=saldo){
            saldo = saldo - valor;
            System.out.println("Valor restante na conta: " + saldo);
            return valor;
        }else{
            System.out.println("O valor de saque é maior que o valor disponível na conta!");
            return 0;
        }
    }
}
