package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor recebido por hora: R$ ");
        double valorHora = sc.nextDouble();

        System.out.print("Horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);

        sc.close();
    }
}