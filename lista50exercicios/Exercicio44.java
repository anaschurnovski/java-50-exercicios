package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        double frete = valorCompra >= 150 ? 0 : 20;

        System.out.printf("Valor do frete: R$ %.2f%n", frete);

        sc.close();
    }
}