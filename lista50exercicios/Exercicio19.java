package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        if (numero < 0) {
            System.out.println("Número negativo.");
        }

        sc.close();
    }
}