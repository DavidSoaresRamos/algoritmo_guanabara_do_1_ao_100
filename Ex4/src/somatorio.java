import java.util.Scanner;

public class somatorio {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int value1 = sc.nextInt();
        System.out.println("Digite o segundo valor");
        int value2 = sc.nextInt();
        int soma = value1 + value2;
        System.out.printf("A soma entre %d e %d é igual a %d", value1, value2, soma);
    }
}