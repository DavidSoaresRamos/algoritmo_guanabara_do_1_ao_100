import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;


class sortearNumero {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int numSort = rd.nextInt(5) + 1;
        System.out.println("Pesca: " + numSort);
        System.out.println("Digite o numero: ");
        int userChoice = sc.nextInt();

        if (userChoice == numSort) {
            System.out.println("Parabens voce acertou!");
        } else if (userChoice != numSort) {
            System.out.println("Voce errou");
        }
    }
}