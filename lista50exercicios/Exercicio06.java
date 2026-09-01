package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Medida em metros: ");
        double metros = sc.nextDouble();

        double cm = metros * 100;

        System.out.printf("%.2f metro(s) equivale(m)" +
                        " a %.2f centímetro(s).%n",
                metros, cm);

        sc.close();
    }
}