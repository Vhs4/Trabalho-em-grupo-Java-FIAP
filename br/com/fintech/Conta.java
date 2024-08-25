package br.com.fintech;

import java.util.Scanner;

public class Conta {
    private Long id;
    private int digitoAgencia;
    private int agenciaConta;
    private String numeroConta;
    private double saldo = 0.0;
    private Scanner scanner = new Scanner(System.in);

    public Conta(Long id, int agenciaConta, int digitoAgencia, String numeroConta) {
        this.id = id;
        this.agenciaConta = agenciaConta;
        this.digitoAgencia = digitoAgencia;
        this.numeroConta = numeroConta;
    }

    public void exibirInformacaoConta() {
        System.out.println("Agência da conta: " + agenciaConta);
        System.out.println("Dígito da conta: " + digitoAgencia);
        System.out.println("Número da conta: " + numeroConta);
    }

    public void adicionarSaldo() {
        System.out.print("Digite o valor para depósito: ");
        double valorDeposito = scanner.nextDouble();
        if (valorDeposito > 0.0) {
            saldo += valorDeposito;
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Valor incorreto. Por favor, tente novamente.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void fazerTranferencia() {
        System.out.print("Digite o valor para transferência: ");
        double valorTransferencia = scanner.nextDouble();
        if (valorTransferencia > 0.0 && valorTransferencia <= saldo) {
            saldo -= valorTransferencia;
            System.out.println("Transferência realizada com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Transferência inválida. Saldo insuficiente ou valor incorreto.");
        }
    }
}
