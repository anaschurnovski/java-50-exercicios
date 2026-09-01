package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Total gasto no mês: R$ ");
        double totalGasto = sc.nextDouble();

        if (totalGasto <= 100) {
            System.out.println("Cliente comum.");

        } else if (totalGasto <= 500) {
            System.out.println("Cliente bronze.");

        } else if (totalGasto <= 1000) {
            System.out.println("Cliente prata.");

        } else {
            System.out.println("Cliente ouro.");
        }

        sc.close();
    }
}