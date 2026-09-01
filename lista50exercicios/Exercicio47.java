package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio47 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcao, quantidade;
        String nomeItem;
        double precoUnitario;

        System.out.println("Digite um valor de 1 a 4 \n" +
                "1 → Hambúrguer — R$ 25,00 \n" +
                "2 → Pizza — R$ 40,00 \n" +
                "3 → Salada — R$ 18,00 \n" +
                "4 → Refrigerante — R$ 8,00 : ");
        opcao = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade = sc.nextInt();

        switch (opcao) {
            case 1:
                nomeItem = "Hambúrguer";
                precoUnitario = 25.00;
                break;

            case 2:
                nomeItem = "Pizza";
                precoUnitario = 40.00;
                break;

            case 3:
                nomeItem = "Salada";
                precoUnitario = 18.00;
                break;

            case 4:
                nomeItem = "Refrigerante";
                precoUnitario = 8.00;
                break;

            default:
                nomeItem = "";
                precoUnitario = 0;
                System.out.printf("Opção inválida%n");
        }

        if (precoUnitario > 0) {
            double valorTotal = quantidade * precoUnitario;
            System.out.printf("Item escolhido: %s%n" +
                            "Quantidade: %d%n" +
                            "Total do pedido: R$ %.2f%n",
                    nomeItem, quantidade, valorTotal);
        }
    }
}