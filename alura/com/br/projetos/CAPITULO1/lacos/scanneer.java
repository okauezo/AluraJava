package alura.com.br.projetos.CAPITULO1.lacos;

import java.util.Scanner;

public class scanneer {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite Seu Filme favorito: ");
        String filme = leitura.nextLine();
        System.out.print("Digite o Ano de lancamento do Filme: ");
        int anoDeLancamento = leitura.nextInt();
        System.out.print("Digite a nota que você recomenda ao Filme: ");
        double notaDeFilme = leitura.nextDouble();

        System.out.print( filme);
        System.out.print(anoDeLancamento);
        System.out.print(notaDeFilme);

        leitura.close();
    }
}
