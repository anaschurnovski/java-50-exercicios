package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Entrada permitida.");
        }

        sc.close();
    }
}