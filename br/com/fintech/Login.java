package br.com.fintech;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}