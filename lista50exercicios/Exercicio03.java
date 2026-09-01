package flamingo.aprendendo.basico.lista50exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idadeAproximada = anoAtual - anoNascimento;

        System.out.printf("Sua idade aproximada é: %d anos.", idadeAproximada);

        sc.close();
    }
}