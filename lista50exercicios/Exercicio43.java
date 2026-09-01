package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        String resultado = numero % 2 == 0 ? "Par." : "Ímpar.";

        System.out.println(resultado);

        sc.close();
    }
}