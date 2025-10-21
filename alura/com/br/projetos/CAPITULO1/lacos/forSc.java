package alura.com.br.projetos.CAPITULO1.lacos;

import java.util.Scanner;

public class forSc {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Diga sua avaliação para o filme  ");
            nota = leitura.nextDouble();

            media = media + nota;
        }

        System.out.println("Media de avaliação do Filme: " + media/3);
    }
}
