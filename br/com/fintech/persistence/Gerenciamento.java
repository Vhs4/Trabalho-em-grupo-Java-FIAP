package br.com.fintech.persistence;

import br.com.fintech.commons.TipoRelatorio;

import java.util.Scanner;

import static br.com.fintech.commons.Genero.CISGENERO;

public class Gerenciamento {
    private Scanner scanner = new Scanner(System.in);
    private Conta conta = new Conta(1L, 5978, 1, "0004955");
    private Login login = new Login();
    private Usuario usuario = new Usuario("João Pedro", "Moreira", "111.222.333-44",
            "55.666.7777-88", CISGENERO, 1990, 1, 1);
    private Relatorio relatorio = new Relatorio(1L, TipoRelatorio.DESPESAS);

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
                    5 - Exibir dados do usuário
                    6 - Atualizar cadastro de usuário
                    7 - Gerar relatório
                    8 - Imprimir detalhes do relatório                
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
                case 5:
                    usuario.exibirDadosDeUsuario();
                    break;
               case 6:
                   usuario.atualizarCadastroDeUsuario();
                   break;
                case 7:
                    relatorio.gerarRelatorio();
                    break;
                case 8:
                    relatorio.imprimirDetalhes();
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


