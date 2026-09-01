package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");

        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);

        sc.close();
    }
}