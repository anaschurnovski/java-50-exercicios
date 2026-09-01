package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura atual: ");
        double temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("Está muito quente hoje.");
        }

        sc.close();
    }
}