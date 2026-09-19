import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");

        double valorDoProduto = entrada.nextDouble();

        double valorComDesconto = valorDoProduto * 0.90;

        System.out.print("O preço do produto com 10% de desconto é: R$ " + valorComDesconto);

    }
}