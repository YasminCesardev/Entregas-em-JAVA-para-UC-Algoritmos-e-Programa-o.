import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String senhacorreta = 2026;
        //para funcionar, teria q colcoar o 2026 em forma de texto. entre aspas
        String senhadigitada;
        String tentativas = 0;

        System.out.println("Dígite sua senha de 4 dígitos: ");
        senhadigitada = entrada.nextString();
        //n existe nextString, teria que ser: nextLine(comando que ler a linha inteira)
        tentativas++;

        while(senhadigitada != senhacorreta) {
//pesquisando e a resuluçao q a ia me recomendou n entendi. pediu para usar equals
            System.out.println("Senha incorreta! Dígite novamente.");
            senhadigitada = entrada.nextString();
            tentativas++;

        }
        System.out.println("Acesso autorizado!");
        System.out.println("Total de tentativas: " + tentativas);
    }
}