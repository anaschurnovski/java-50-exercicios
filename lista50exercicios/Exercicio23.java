package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo do cliente: R$ ");
        double saldo = sc.nextDouble();

        System.out.print("Valor do produto: R$ ");
        double valorProduto = sc.nextDouble();

        if (saldo >= valorProduto) {
            System.out.println("Compra aprovada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        sc.close();
    }
}