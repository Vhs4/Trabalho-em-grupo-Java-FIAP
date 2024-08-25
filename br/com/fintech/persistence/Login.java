package br.com.fintech.persistence;

import java.util.Scanner;

public class Login {

    private Scanner scanner = new Scanner(System.in);

    public void realizarLogin() {
        System.out.print("Nome de usuário: ");
        String username = scanner.nextLine();

        System.out.print("Senha: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("senha")) {
            System.out.println("Login bem-sucedido!\nBem-vindo, " + username + "!");
            UserSession.setUsername(username);
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }
    }

    public void verificarLogin() {
        String currentUser = UserSession.getUsername();

        if (currentUser == null) {
            System.out.println("Nenhum usuário está logado. Iniciando o processo de login...");
            realizarLogin();
            currentUser = UserSession.getUsername();
        }

        if (currentUser != null) {
            System.out.println("Usuário logado: " + currentUser);
        } else {
            System.out.println("Login falhou. Encerrando o programa.");
            System.exit(0);  // Encerra o programa se o login falhar
        }
    }

}