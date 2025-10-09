package alura.com.br.projetos.CAPITULO1.lacos;

public class Condicao {
    public static void main(String[] args) {

        int anoDeLancamento = 1990;
        boolean incluirNoPlano = true;
        double nota = 8.1;
        String tipoDePlano = "plus";

        if (anoDeLancamento > 2025) {
            System.out.println("lancamento que os clientes estao curtindo!!");
        } else {
            System.out.println("fora da epoca! saiu da epoca faz tempo");
        }

        if (incluirNoPlano == true || tipoDePlano.equals("plus")) {
            System.out.println("Filme Liberado para assistir Sr");
        } else {
            System.out.println("Acesso negado! fatura em aberto");
        }
    }
}
