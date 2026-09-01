package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();

        if (quantidade > 0) {
            System.out.println("Produto disponível para venda.");
        }

        sc.close();
    }
}