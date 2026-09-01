package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Cargo: ");
        String cargo = sc.nextLine();

        System.out.print("Salário: R$ ");
        double salario = sc.nextDouble();

        System.out.print("O funcionário está ativo? (true/false): ");
        boolean ativo = sc.nextBoolean();

        System.out.printf("Funcionário: %s |" +
                        " Cargo: %s |" +
                        " Salário: R$ %.2f |" +
                        " Ativo: %b%n",
                nome, cargo, salario, ativo);

        sc.close();
    }
}