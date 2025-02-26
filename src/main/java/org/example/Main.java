package org.example;

public class Main {
    public static void main(String[] args) {

        contaCorrente cc = new contaCorrente(12345, "João Silva", 1000.0, 500.0);
        System.out.println("Testando contaCorrente:");
        cc.exibirInformacoes();
        cc.sacar(300);
        cc.sacar(800);
        cc.sacar(500);
        cc.exibirInformacoes();

        contaInvestimento ci = new contaInvestimento(23456, "Maria Oliveira", 2000.0);
        System.out.println("\nTestando contaInvestimento:");
        ci.exibirInformacoes();
        ci.sacar(500);
        ci.sacar(2000);
        ci.exibirInformacoes();

        contaInvestimentoAltoRisco ciar = new contaInvestimentoAltoRisco(34567, "Carlos Souza", 15000.0);
        System.out.println("\nTestando contaInvestimentoAltoRisco:");
        ciar.exibirInformacoes();
        ciar.sacar(5000);
        ciar.sacar(20000);
        ciar.sacar(500);
        ciar.exibirInformacoes();

        contaPoupanca cp = new contaPoupanca(45678, "Ana Costa", 3000.0);
        System.out.println("\nTestando contaPoupanca:");
        cp.exibirInformacoes();
        cp.sacar(1000);
        cp.sacar(3000);
        cp.exibirInformacoes();

        contaSalario cs = new contaSalario(56789, "Pedro Rocha", 1500.0, 0.0);
        System.out.println("\nTestando contaSalario:");
        cs.exibirInformacoes();
        cs.sacar(500);
        cs.sacar(500);
        cs.sacar(1000); 
        cs.exibirInformacoes();
    }
}