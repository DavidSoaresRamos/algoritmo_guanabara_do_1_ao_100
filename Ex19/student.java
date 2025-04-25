// Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua média e mostre na tela. No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0).
import java.util.Scanner;

public class student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String name = sc.nextLine();
        System.out.println("Digite a primeira nota");
        int note1 = sc.nextInt();
        System.out.println("Digite a segunda nota");
        int note2 = sc.nextInt();
        int media = note1 + note2 / 2;
System.out.printf("O aluno: %s \n teve uma media de: %d \n", name, media);
 if (media >= 7) {
     System.out.println("Parabens voce teve um bom aproveitamento");
 }
 else {
     System.out.println("Sinto muito voce não teve um bom aproveitamento");
 }

    }
}
