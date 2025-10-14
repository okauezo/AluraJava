package alura.com.br.projetos.CAPITULO1.lacos;

import java.util.Scanner;

// Decidir mudar o Switch simples e aplicar o Scanner para melhorar o codigo.

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um Numero da semana: ");
        int dia = sc.nextInt();

        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-Feira";
                break;
            case 3:
                nomeDia = "Terça-Feira";
                break;
            case 4:
                nomeDia = "Quarta-Feira";
                break;
            case 5:
                nomeDia = "Quinta-Feira";
                break;
            case 6:
                nomeDia = "Sexta-Feira";
                break;
            case 7:
                nomeDia = "Sabado";
                break;
            default:
                nomeDia = "Dia invalido";
                break;
        }

        System.out.print("Dia da semana escolhido foi: " + nomeDia);
    }
}
