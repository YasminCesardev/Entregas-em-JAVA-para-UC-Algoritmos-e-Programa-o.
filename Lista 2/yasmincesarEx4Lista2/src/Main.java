import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = entrada.nextInt();

        if (numero1 >= numero2  && numero1 >= numero3) {
            System.out.print("o maior número é: " + numero1);

        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.print("O maior número é: " + numero2);

        } else {
            System.out.print("O maior número é: " + numero3);

        }
    }
}