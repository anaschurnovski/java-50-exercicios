package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = sc.nextDouble();

        if (saldo > 0) {
            System.out.println("Você possui saldo disponível.");
        }

        sc.close();
    }
}