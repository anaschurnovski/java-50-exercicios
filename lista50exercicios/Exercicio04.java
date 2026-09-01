package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String produto = sc.nextLine();

        System.out.print("Valor unitário: R$ ");
        double valorUnitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        double valorTotal = valorUnitario * quantidade;

        System.out.printf("O valor total de %d unidade(s)" +
                        " de %s é R$ %.2f.%n",
                quantidade, produto, valorTotal);

        sc.close();
    }
}