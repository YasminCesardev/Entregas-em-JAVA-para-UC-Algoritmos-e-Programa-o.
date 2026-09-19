import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = entrada.nextInt();

        if (idade <= 12) {
            System.out.print("Categoria: Infantil");

        } else if (idade <= 17) {
            System.out.print("Categoria: Juvenil");

        } else {
            System.out.print("Categoria: Adulto");
        }
    }
}