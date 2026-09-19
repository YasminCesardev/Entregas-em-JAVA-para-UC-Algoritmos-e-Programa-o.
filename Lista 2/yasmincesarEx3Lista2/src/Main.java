import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            int quadrado = numero * numero;

            System.out.print("O número é para: ");
            System.out.print("O quadrado do número é: " + quadrado);

        } else {
            int cubo = numero * numero * numero;

            System.out.print("O número é impar.");
            System.out.print("O cubo do número é: " + cubo);

        }
    }
}