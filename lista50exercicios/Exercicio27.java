package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (email.equals("admin@email.com") && senha.equals("123456")) {
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Email ou senha inválidos.");
        }

        sc.close();
    }
}