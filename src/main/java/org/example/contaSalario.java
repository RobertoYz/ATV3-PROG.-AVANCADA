package org.example;

public class contaSalario extends contaCorrente{
    private int saquesGratuitos;
    private double taxaSaque = 5.00;
    public contaSalario(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
    }

    @Override
    public double sacar(double valor){
        if(saquesGratuitos < 1){
            if(valor <= saldo){
                saldo = saldo - valor;
                System.out.println("Valor restante na conta: " + saldo);
                saquesGratuitos = saquesGratuitos +1;
                return valor;
            }else{
                System.out.println("O valor de saque é maior que o valor disponível na conta!");
                return 0;
            }
        }else{
            if(valor + taxaSaque <= saldo){
                saldo = saldo - valor + taxaSaque;
                System.out.println("Valor restante na conta: " + saldo);
                return valor;
            }else{
                System.out.println("O valor de saque é maior que o valor disponível na conta!");
                return 0;
            }
        }
    }
}
