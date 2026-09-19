import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu salário atual: ");
        double salário = entrada.nextDouble();

        System.out.print("Digite a porcentagem de aumento: ");
        double porcentagem = entrada.nextDouble();

        double aumento = salário * porcentagem / 100;

        System.out.print("Valor do aumento: R$ " + aumento);
    }
}