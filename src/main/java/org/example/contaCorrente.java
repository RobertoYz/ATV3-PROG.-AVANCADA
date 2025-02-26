package org.example;

public class contaCorrente extends contaBancaria{
    double limiteChequeEspecial;
    public contaCorrente(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public double sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
            return 0;
        }
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Valor restante do saldo: " + saldo);
            return valor;
        } else {
            double diferenca = valor - saldo;
            if (diferenca <= limiteChequeEspecial) {
                limiteChequeEspecial = limiteChequeEspecial - diferenca;
                saldo = 0;
                System.out.println("Limite do cheque especial restante: " + limiteChequeEspecial);
                return valor;
            } else {
                System.out.println("Saldo insuficiente e limite do cheque especial excedido!");
                return 0;
            }
        }
    }


}
