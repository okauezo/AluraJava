package alura.com.br.projetos.CAPITULO1;

public class PrimeiraAplicacao {
    public static void main(String[] args) {

        String nomeFilme = "Top Gun";
        int idade = 14;
        double nota = 9.8987;


        System.out.println("Esse é o Screen Match");
        System.out.println(String.format("Filme: %s Maverick, tem %d anos dez do lançamento e tem uma nota de %.2f na cena do cinema", nomeFilme, idade, nota));

        int anoDeLancamento = 2011;
        System.out.println("Ano de lancamento: " + anoDeLancamento);

        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = 7.5 + 6.4 + 9.6;
        System.out.println("media do Filme: " + media);

        String sinopse;
        sinopse = """
                Top Gun
                Filme de Aventura com galã dos anos 80
                muito bom!
                Ano de Lançamento
                """ + anoDeLancamento;

        System.out.println(sinopse);


        String comparar = "Top Gun Maverick";
        if (comparar.equals("Top Gun, Maverick")){
            System.out.println("Filme certo");
        }else {
            System.out.println("Filme nao esta certo");
        }

        String nome = "kaue";
        if (nome.equalsIgnoreCase("kaUe")){
            System.out.println("nome correto!");
        } else {
            System.out.println("nome incorreto!");
        }

        int clasificacao;
        clasificacao = (int) (media /2);
        System.out.println("nota do filme no G1: " + clasificacao);
    }
}
