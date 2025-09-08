import java.util.Scanner;
import java.util.Random;

class jokenpo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int iaChoice = rd.nextInt(3) + 1;
        System.out.printf("pesca" + iaChoice + "\n");
        int papel = 1;
        int tesoura = 2;
        int pedra = 3;

        System.out.println("Digite o numero da opção que deseja jogar \n 1 - Papel \n 2 - Tesoura \n 3 - Pedra");
        int playerChoice = sc.nextInt();

        if (playerChoice == iaChoice) {
            System.out.println("Empate");
        } else if ((playerChoice == papel) && (iaChoice == tesoura)) {
            System.out.println("Voce perdeu");
        } else if ((playerChoice == papel) && (iaChoice == pedra)) {
            System.out.println("Voce ganhou");
        } else if ((playerChoice == tesoura) && (iaChoice == pedra)) {
            System.out.println("Voce perdeu");
        } else if ((playerChoice == tesoura) && (iaChoice == papel)) {
            System.out.println("Voce ganhou");
        } else if ((playerChoice == pedra) && (iaChoice == papel)) {
            System.out.println("Voce perdeu");
        } else if ((playerChoice == pedra) && (iaChoice == tesoura)) {
            System.out.println("Voce ganhou");

        }
    }
}