// Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.

import java.util.Scanner;

public class student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        float note1 = sc.nextFloat();
        System.out.println("Digite a segunda nota");
        float note2 = sc.nextFloat();
        float media = (note1 + note2) / 2;
        System.out.printf("A media entre %f e %f é igual a %f", note1, note2, media);
    }
}