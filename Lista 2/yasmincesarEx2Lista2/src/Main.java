import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de kwh consumidos: ");
        double kwh = entrada.nextDouble();

        double valor;

        if (kwh < 100) {
            valor = kwh * 0.50;
        } else if (kwh <= 200) {
            valor = kwh * 0.70;
        } else {
            valor = kwh * 0.90;
        }
        System.out.print("Valor da conta: R$ " + valor);

        }
    }
