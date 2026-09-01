package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade do atleta: ");
        int idade = scanner.nextInt();

        if (idade <= 10) {
            System.out.println("Infantil.");

        } else if (idade <= 15) {
            System.out.println("Juvenil.");

        } else if (idade <= 20) {
            System.out.println("Júnior.");

        } else if (idade <= 35) {
            System.out.println("Profissional.");

        } else {
            System.out.println("Sênior.");
        }

        scanner.close();
    }
}