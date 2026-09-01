package flamingo.aprendendo.basico.lista50exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = sc.nextLine();

        System.out.printf("Olá! Meu nome é %s," +
                        " tenho %d anos" +
                        " e moro em %s.%n",
                nome, idade, cidade);

        sc.close();
    }
}