package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aluno aprovado.");
        }

        sc.close();
    }
}