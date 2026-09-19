import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite seu peso em kg: ");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.print("Seu imc é: " + imc);
    }
}