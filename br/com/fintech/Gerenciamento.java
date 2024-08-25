package br.com.fintech;

import java.util.Scanner;

public class Gerenciamento {
    private Scanner scanner = new Scanner(System.in);
    private Conta conta = new Conta(1L, 5978, 1, "0004955");
    private Login login = new Login();

    public void exibirGerenciamento() {
        //Login
        login.realizarLogin();
        login.verificarLogin();

        int op;
        do {
            System.out.println("""
                    \n
                    1 - Exibir informações da conta
                    2 - Adicionar saldo
                    3 - Exibir saldo
                    4 - Fazer transferência
                    0 - Sair
                    """);

            op = scanner.nextInt();
            switch (op) {
                //Conta
                case 1:
                    conta.exibirInformacaoConta();
                    break;
                case 2:
                    conta.adicionarSaldo();
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 4:
                    conta.fazerTranferencia();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (op != 0);
    }
}


