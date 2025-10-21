package alura.com.br.projetos.CAPITULO1.Desafios;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo ao seu Banco Nacional");
        System.out.println("***********************\n");

        System.out.print("Insira seu nome para podermos estar inicializando sua conta: ");
        String nomeCleinte = sc.nextLine();

        System.out.print("Tipo conta: ");
        String tipoConta = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        System.out.println("***********************\n");

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual: " + saldoInicial);
                    break;

                case 2:
                    System.out.println("Insira o valor a ser recebido: ");
                    double deposito = sc.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("valor invalido. informe um numero valido");
                    } else {
                        saldoInicial += deposito;
                        System.out.printf("Depósito realizado! Novo saldo: R$ %.2f%n: ", saldoInicial);
                    }
                    break;

                case 3:
                    System.out.println("Insira o valor a ser transferido: ");
                    double transferir = sc.nextDouble();
                    if (transferir <= 0) {
                        System.out.println("valor invalido. informe um numero valido");
                    } else if (transferir > saldoInicial) {
                        System.out.println("Saldo insuficiente para transferir");
                    } else {
                        saldoInicial -= transferir;
                        System.out.printf("Transação realizada com sucesso! Saldo atual: R$ %.2f%n: ", saldoInicial);
                    }
                    break;

                case 4:
                    System.out.println("Encerrando... Obrigado por usar o banco!");
                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente!");
            }
        } while (opcao != 4);

        sc.close();
    }
}