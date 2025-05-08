//Crie um programa que leia duas notas de um aluno e calcule a sua média,
//mostrando uma mensagem no final, de acordo com a média atingida:
// - Média até 4.9: REPROVADO
// - Média entre 5.0 e 6.9: RECUPERAÇÃO
// - Média 7.0 ou superior: APROVADO

import java.util.Scanner;

public class mediaDoAluno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a primeira nota");
        float primeiraNota = sc.nextFloat();
        System.out.println("Informe a segunda nota");
        float segundaNota = sc.nextFloat();
        float media = primeiraNota + segundaNota / 2;
        System.out.println("Sua media foi: " + media);
        if (media < 5) {
            System.out.println("Voce esta Reprovado");
        } else if ((media > 5) && (media < 7)) {
            System.out.println("Voce esta em Recuperação");
        } else {
            System.out.println("Voce foi aprovado");
        }

    }
}
