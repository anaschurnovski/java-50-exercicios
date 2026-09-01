package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: R$ ");
        double salario = sc.nextDouble();

        if (salario <= 1500) {
            System.out.println("Salário baixo.");

        } else if (salario <= 3000) {
            System.out.println("Salário médio.");

        } else if (salario <= 7000) {
            System.out.println("Salário bom.");

        } else {
            System.out.println("Salário alto.");
        }

        sc.close();
    }
}