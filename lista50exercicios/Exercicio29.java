package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        double valorFinal;

        if (valorCompra >= 200) {
            valorFinal = valorCompra * 0.90;

        } else {
            valorFinal = valorCompra;
        }

        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);

        sc.close();
    }
}