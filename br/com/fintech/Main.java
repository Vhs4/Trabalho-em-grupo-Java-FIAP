package br.com.fintech;

public class Main {
    public static void main(String[] args) {
        String currentUser = UserSession.getUsername();
        
        if (currentUser == null) {
            System.out.println("Nenhum usuário está logado. Iniciando o processo de login...");
            Login.main(null);

            currentUser = UserSession.getUsername();
        }

        if (currentUser != null) {
            System.out.println("Usuário logado: " + currentUser);
        } else {
            System.out.println("Login falhou. Encerrando o programa.");
        }
    }
}
