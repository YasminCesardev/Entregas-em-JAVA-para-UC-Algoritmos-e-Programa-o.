import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int senhacorreta = 2026;
        int senhadigitada ;
        int tentativas = 0;

        System.out.println("Digite sua senha de 4 dígitos: ");
        senhadigitada = entrada.nextInt();
        tentativas++;

        while(senhadigitada != senhacorreta) {

            System.out.println("Senha incorreta! Tente novamente.");

            System.out.println("Dígite sua senha de 4 dígitos: ");
            senhadigitada = entrada.nextInt();
            tentativas++;
        }
        System.out.println("Acesso autorizado!");
        
        System.out.println("Total de tentativas: " + tentativas);
    }
}