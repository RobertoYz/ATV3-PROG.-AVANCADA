package org.example;

public class contaInvestimentoAltoRisco extends contaInvestimento{
    private double saldoMinimo = 10000;
    public contaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public double sacar(double valor){
        if (saldo >= saldoMinimo){
            if( valor + ((valor * 5)/100) <=saldo){
                saldo = saldo - (valor + ((valor * 5)/100));
                System.out.println("Valor restante na conta: " + saldo);
                return valor;
            }else{
                System.out.println("O valor de saque é maior que o valor disponível na conta!");
                return 0;
            }
        }else{
            System.out.println("Saldo inferior a 10 mil");
            return 0;
        }
    }
}
