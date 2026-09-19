import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        System.out.print("Escolha a unidade para conversão:");
        System.out.print("1 - Fahrenheit");
        System.out.print("2 - Kelvin");

        System.out.print("Digite dua opção: ");
        int opção = entrada.nextInt();

        if (opção == 1) {
            double fahrenheit = celsius * 1.8 + 32;

            System.out.print("Temperatura em Fahrenheit: " + fahrenheit + "F");

        } else if (opção == 2) {
            double kelvin = celsius + 273.15;

            System.out.print("Temperatura em Kelvin: " + kelvin + "k");

        } else {
            System.out.print("Opção inválida!");

        }

    }
}