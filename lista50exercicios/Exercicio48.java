package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a operação:\n" +
                "1 - Soma\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão");
        int operacao = sc.nextInt();

        System.out.println("Digite o primeiro número:");
        double numero01 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero02 = sc.nextDouble();

        switch (operacao) {
            case 1:
                System.out.printf("Operação escolhida: Soma%n" +
                        "Resultado: %.1f%n", numero01 + numero02);
                break;

            case 2:
                System.out.printf("Operação escolhida: Subtração%n" +
                        "Resultado: %.1f%n", numero01 - numero02);
                break;

            case 3:
                System.out.printf("Operação escolhida: Multiplicação%n" +
                        "Resultado: %.1f%n", numero01 * numero02);
                break;

            case 4:
                if (numero02 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    System.out.printf("Operação escolhida: Divisão%n" +
                            "Resultado: %.1f%n", numero01 / numero02);
                }
                break;

            default:
                System.out.println("Operação inválida");
        }

        sc.close();
    }
}