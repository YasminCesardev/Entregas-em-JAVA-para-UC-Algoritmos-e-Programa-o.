import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da sua renda mensal: ");
        double renda = entrada.nextDouble();

        System.out.print("Digite o valor da prestação que deseja pagar: ");
        double prestacao = entrada.nextDouble();

        if(prestacao > renda * 0.30) {
            System.out.print("Financiamento negado por alta prestação.");

        }else if(prestacao > 3000 && renda < 10000) {
            System.out.print("Financiamennto negado por baixa renda.");

        }else {
            System.out.print("Financiamento aprovado!");
        }
    }
}