package alura.com.br.projetos.CAPITULO1.Desafios;

import java.util.Scanner;
import java.util.Random;

public class DesafioDaSorte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tente a sorte de adivinha o número! ");

        Random sorteio = new Random();
        int numeroSorteio = sorteio.nextInt(101);


        boolean acertou = false;
        for (int tentativa = 1; tentativa < 6; tentativa++) {
            System.out.println("Tentativa " + tentativa + ": Digite um numero: ");
            int chute = sc.nextInt();

            if(chute > numeroSorteio){
                System.out.println("O numero é menor que : " + chute + " Tente novamente!");
            } else if(chute < numeroSorteio){
                System.out.println("O numero é maior que : " +  chute + " Tente novamente!");
            } else {
                System.out.println("parabéns! Você acertou!");
                acertou = true;
                break;
            }
        }

        if(!acertou){
            System.out.println("Você não conseguiu adivinhar! O número era: " + numeroSorteio);
        }

        sc.close();
    }
}
