package alura.com.br.projetos.CAPITULO1.Desafios;

public class Desafios1 {
    public static void main(String[] args) {

        // 1 Notas decimal

        double nota1 = 6.9;
        double nota2 = 7.8;
        double media = (nota1 + nota2) / 2;
        System.out.println("nota: " + media);

        System.out.println("/------------------------/");


        // 2 Declare uma variável do tipo double e uma variável do tipo int.
        // Faça o casting da variável double para int e imprima o resultado.

        double n2 = 34.3;
        int n3 = (int) n2;
        System.out.println(n3);

        System.out.println("/------------------------/");

        //3 Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char letra = 'E';
        char letra2 = 'U';
        String palavra = "sou DEV";

        String mensagem = "" + letra + letra2  + " " + palavra;
        System.out.println(mensagem);

        System.out.println("/------------------------/");

        // 4 Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precoProduto = 20.99;
        int quantidade = 4;
        double total = (precoProduto * quantidade);
        System.out.println("preco produto: " + total);

        System.out.println("/------------------------/");


        // 5 Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEmDolares = 20;
        double valorCotacao = 4.94;

        double valorEmReais = valorEmDolares * valorEmDolares;

        System.out.printf("US$ %.2f equivalem a R$ %.2f%n", valorEmDolares, valorEmReais);

        System.out.println("/------------------------/");

        // 6 Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto.
        // Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        // Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 150;
        double percentualDesconto = 10;

        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoNovo = precoOriginal - valorDesconto;


        System.out.printf("Preço Original: R$ %.2f%n",  precoOriginal);
        System.out.printf("Novo Preço: R$ %.2f%n", precoNovo);
        System.out.printf("Valor Desconto: R$ %.2f%n", valorDesconto);
    }
}
