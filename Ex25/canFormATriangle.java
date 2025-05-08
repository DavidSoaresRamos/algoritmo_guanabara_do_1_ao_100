//   Crie um programa que leia o tamanho de três segmentos de reta.
//   Analise seus comprimentos e diga se é possível formar um triângulo com essas
//   retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
//   de cada lado deve ser menor que a soma dos outros dois.


import java.util.Scanner;

public class canFormATriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro segmento");
        int firstSegment = sc.nextInt();
        System.out.println("Digite o segundo segmento");
        int secondSegment = sc.nextInt();
        System.out.println("Digite o terceiro segmento");
        int thirdSegment = sc.nextInt();

        if ((firstSegment < secondSegment + thirdSegment) && (secondSegment < thirdSegment + firstSegment) && (thirdSegment < firstSegment + secondSegment)) {
            System.out.println("Pode formar um triangulo");
        } else {
            System.out.println("Não pode formar um triangulo");
        }
    }
}
