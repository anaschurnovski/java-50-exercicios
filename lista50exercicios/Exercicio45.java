package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Salário do funcionário: R$ ");
        double salario = sc.nextDouble();

        double bonus = salario < 3000 ? 500 : 200;
        double valorTotal = salario + bonus;

        System.out.printf(
                "Salário: R$ %.2f%n" +
                        "Bônus: R$ %.2f%n" +
                        "Valor total: R$ %.2f%n",
                salario, bonus, valorTotal
        );

        sc.close();
    }
}