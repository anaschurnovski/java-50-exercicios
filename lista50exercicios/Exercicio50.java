package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o plano:\n" +
                "1 - Básico\n" +
                "2 - Profissional\n" +
                "3 - Premium");
        int plano = sc.nextInt();

        System.out.println("Quantos meses?");
        int meses = sc.nextInt();

        String nomePlano;
        double precoMensal;

        switch (plano) {
            case 1:
                nomePlano = "Básico";
                precoMensal = 29.90f;
                break;

            case 2:
                nomePlano = "Profissional";
                precoMensal = 59.90f;
                break;

            case 3:
                nomePlano = "Premium";
                precoMensal = 99.90f;
                break;

            default:
                nomePlano = "";
                precoMensal = 0;
                System.out.println("Plano inválido");
        }

        if (precoMensal > 0) {
            double desconto = (meses == 12) ? 0.10 : 0;
            double valorTotal = meses * precoMensal * (1 - desconto);


            System.out.printf("Plano escolhido: %s%n" +
                            "Meses contrados: %d%n" +
                            "Desconto: %.0f%%%n" +
                            "Preço final: R$ %.2f%n",
                    nomePlano, meses, desconto * 100, valorTotal);
        }

        sc.close();
    }
}