package alura.com.br.projetos.CAPITULO1.Desafios;

import java.util.Scanner;

public class Desafios2 {
    public static void main(String[] args) {

        // 1 Crie um programa que solicite ao usuário digitar um número.
        // Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber se é positivo ou negativo: ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("O Numero é POSITIVO");
        } else {
            System.out.println("O Numero é NEGATIVO!");
        }


        // 2 Peça ao usuário para inserir dois números inteiros.
        // Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.


        System.out.println("Digite o primeiro numero inteiro: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");
            if (numero1 > numero2) {
                System.out.println("O primeiro número é maior");
            } else {
                System.out.println("O segundo número é maior");
            }
        }


        // 3 Crie um menu que oferece duas opções ao usuário: "
        // 1 Calcular área do quadrado" e " 2.
        // Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

        System.out.println("===== MENU DE CÁLCULO DE ÁREA =====");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("digite o lado do quadrado: ");
            double lado= sc.nextDouble();
            double ladoQuadrado = lado * lado;
            System.out.println("A Area do quadrado é:  " + ladoQuadrado);
        } else if (opcao == 2) {
            System.out.println("Digite o valor do raio do círculo: ");
            double raio = sc.nextDouble();
            double areacircular = Math.PI * Math.pow(raio, 2);
            System.out.println("A área do círculo é: " + areacircular);
        } else {
            System.out.println(" Opção sugerida invalida!");
        }


    }
}

