package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota do aluno: ");
        double nota = sc.nextDouble();

        System.out.print("Porcentagem de presença: ");
        double presenca = sc.nextDouble();

        if (nota >= 7 && presenca >= 75) {
            System.out.println("Aprovado.");

        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação.");

        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}