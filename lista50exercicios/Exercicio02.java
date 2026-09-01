package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Idade do aluno: ");
        int idade = sc.nextInt();

        System.out.print("Nota final: ");
        double notaFinal = sc.nextDouble();

        System.out.printf("O aluno %s" +
                        " tem %d anos" +
                        " e sua nota final foi %.2f.%n",
                nome, idade, notaFinal);

        sc.close();
    }
}