package alura.com.br.projetos.CAPITULO1;

public class Desafios {
    public static void main(String[] args) {

        // 1 Notas decimal

        double nota1 = 6.9;
        double nota2 = 7.8;
        double media = (nota1 + nota2) / 2;
        System.out.println("nota: " + media);


        // 2 Declare uma variável do tipo double e uma variável do tipo int.
        // Faça o casting da variável double para int e imprima o resultado.

        double n2 = 34.3;
        int n3 = (int) n2;
        System.out.println(n3);

        //3 Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char letra = 'E';
        char letra2 = 'U';
        String palavra = "sou DEV";

        String mensagem = "" + letra + letra2  + " " + palavra;
        System.out.println(mensagem);

        // 4 Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precoProduto = 20.99;
        int quantidade = 4;
        double total = (precoProduto * quantidade);
        System.out.println("preco produto: " + total);


        // 5 Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        
    }
}
