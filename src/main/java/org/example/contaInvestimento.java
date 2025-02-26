package org.example;

public class contaInvestimento extends contaBancaria{
    private double taxaRetirada = 2;
    public contaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.taxaRetirada = taxaRetirada;
    }

    @Override
    public double sacar(double valor) {
        if( valor + ((valor * taxaRetirada)/100) <=saldo){
            saldo = saldo - (valor + ((valor * taxaRetirada)/100));
            System.out.println("Valor restante na conta: " + saldo);
            return valor;
        }else{
            System.out.println("O valor de saque é maior que o valor disponível na conta!");
            return 0;
        }
    }
}
