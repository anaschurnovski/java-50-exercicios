package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o tipo de combustível \n" +
                "1-Gasolina \n" +
                " 2-Etanol \n" +
                " 3-Diesel: ");

        int tipoCombustivel = sc.nextInt();

        System.out.printf("Informe a quantidade de litros: ");

        double litros = sc.nextDouble();

        String nomeCombustivel;
        double precoLitro;

        switch (tipoCombustivel) {

            case 1:
                nomeCombustivel = "Gasolina ";
                precoLitro = 5.89;
                break;

            case 2:
                nomeCombustivel = "Etanol ";
                precoLitro = 3.99;
                break;

            case 3:
                nomeCombustivel = "Diesel ";
                precoLitro = 6.19;
                break;

            default:
                nomeCombustivel = "";
                precoLitro = 0;
        }

        double valorTotal = litros * precoLitro;

        System.out.printf("Combustível escolhido: %s%n" +
                        "Qtd de Litros: %.2f%n" +
                        "Valor total: R$ %.2f%n",
                nomeCombustivel, litros, valorTotal);

        sc.close();
    }
}
