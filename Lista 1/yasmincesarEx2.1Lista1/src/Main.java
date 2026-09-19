import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1;
        double numero2;
        double numero3;

        System.out.print("Insira o primeiro numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Insira o segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.print("Insira o terceiro numero: ");
        numero3 = entrada.nextInt();

        double resultado = (numero1 + numero2 + numero3) / 3.0;

        System.out.print("A media aritmética dos numeros" + numero1 + "," + numero2 + "," + numero3 + "," + "é: " + resultado + ".");

    }
}