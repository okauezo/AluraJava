package alura.com.br.projetos.CAPITULO1;


public class Fahrenheit {
    public static void main(String[] args) {


        double celsius = 50;
        double fahrenheit;

        fahrenheit = (celsius * 7.0/6.4) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + " °F");

        int temperatura = (int) (fahrenheit);
        System.out.println("temperatura arredondada: " + temperatura + "°F");
    }
}
