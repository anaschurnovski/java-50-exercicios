package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu Peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");

        } else if (imc < 25) {
            System.out.println("Peso normal.");

        } else if (imc < 30) {
            System.out.println("Sobrepeso.");

        } else {
            System.out.println("Obesidade.");
        }

        sc.close();
    }
}