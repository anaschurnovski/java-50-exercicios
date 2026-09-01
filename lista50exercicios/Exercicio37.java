package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double valorOriginal = sc.nextDouble();

        double percentualDesconto;

        if (valorOriginal <= 100) {
            percentualDesconto = 0;

        } else if (valorOriginal <= 300) {
            percentualDesconto = 0.05;

        } else if (valorOriginal <= 500) {
            percentualDesconto = 0.10;

        } else {
            percentualDesconto = 0.15;
        }

        double desconto = valorOriginal * percentualDesconto;
        double valorFinal = valorOriginal - desconto;

        System.out.printf(
                "Valor original: R$ %.2f%n" +
                        "Desconto: R$ %.2f%n" +
                        "Valor final: R$ %.2f%n",
                valorOriginal, desconto, valorFinal
        );

        sc.close();
    }
}