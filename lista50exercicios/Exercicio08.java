package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        double dobro = numero * 2;
        double metade = numero / 2;

        System.out.printf("Dobro: %.2f | " +
                "Metade: %.2f%n",
                dobro, metade);

        sc.close();
    }
}