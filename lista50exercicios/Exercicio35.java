package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de XP: ");
        int xp = sc.nextInt();

        if (xp < 1000) {
            System.out.println("Iniciante.");

        } else if (xp < 5000) {
            System.out.println("Intermediário.");

        } else if (xp < 10000) {
            System.out.println("Avançado.");

        } else {
            System.out.println("Lendário.");
        }

        sc.close();
    }
}