package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo da conta: R$ ");
        double saldo = sc.nextDouble();

        System.out.print("Valor do saque: R$ ");
        double saque = sc.nextDouble();

        if (saque <= saldo) {
            saldo = saldo - saque;
            System.out.println("Saque realizado com sucesso.");
            System.out.printf("Saldo restante: R$ %.2f%n", saldo);

        } else {
            System.out.println("Saldo insuficiente.");
        }

        sc.close();
    }
}