package alura.com.br.projetos.CAPITULO1.Desafios;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.print("Nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Tipo de conta: ");
        String tipoConta = sc.nextLine();

        System.out.print("Saldo inicial: R$ ");
        double saldo = sc.nextDouble();

        System.out.println("***********************");

    }
}
