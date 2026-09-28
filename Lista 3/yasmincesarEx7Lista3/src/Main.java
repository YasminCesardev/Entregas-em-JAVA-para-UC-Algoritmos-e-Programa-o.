import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota;
        double soma = 0;
        int contador = -1;

        do {
            System.out.println("Digite uma nota(-1 para encerrar): ");
            nota = entrada.nextDouble();

            soma += nota;
            contador++;

        } while (nota >= 0);
        if (contador == 0) {
            System.out.println("Digite uma nota");

        } else {

            double soma2 = soma - nota;
            double media = soma2 / contador;

            System.out.printf("Notas dígitadas: " + contador + "notas e a média  simples é %.2f", media);
            //para poder printar número decimal tem que usar printf
        }
        }

        }


