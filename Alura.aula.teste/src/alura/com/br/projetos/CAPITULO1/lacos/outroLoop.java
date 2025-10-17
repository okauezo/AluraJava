package alura.com.br.projetos.CAPITULO1.lacos;

import java.util.Scanner;

public class outroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        double totalDeNotas = 0;

        while (nota != -1) {

            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar! ");
            nota = leitura.nextDouble();

            if (nota != -1){
            media = media + nota;
            totalDeNotas++;

            }
        }

        System.out.println("Media de avaliação do Filme: " + media / totalDeNotas);

        leitura.close();
    }
}
