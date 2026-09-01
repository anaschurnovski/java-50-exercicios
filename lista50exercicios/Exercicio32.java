package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();

        if (nota >= 9) {
            System.out.println("Excelente.");

        } else if (nota >= 7) {
            System.out.println("Bom.");

        } else if (nota >= 5) {
            System.out.println("Recuperação.");

        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}