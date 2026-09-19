import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu salário atual: ");
        double salario = entrada.nextDouble();

        System.out.print("Digite a porcentagem de aumento: ");
        double porcentagem = entrada.nextDouble();

        double aumento = salario * porcentagem / 100;
        double novosalario = salario + aumento;

        System.out.print("Valor do aumento: R$ ");
        System.out.print("Novo salario: R$ " + novosalario);

    }
}