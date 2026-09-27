import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = entrada.nextInt();
//imprimir mensagem pedindo o número inteiro
        int i = 1;
//declara a variável
        while (i <= n) {
            //chave de repetição
            System.out.println("Praticando lógica de programação!");
            i++;
        }
    }
}