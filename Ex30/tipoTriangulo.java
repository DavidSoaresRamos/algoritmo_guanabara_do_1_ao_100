//[DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
//de triângulo será formado:
// - EQUILÁTERO: todos os lados iguais
// - ISÓSCELES: dois lados iguais
// - ESCALENO: todos os lados diferentes

import java.util.Scanner;

public class tipoTriangulo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro segmento");
        int firstSegment = sc.nextInt();
        System.out.println("Digite o segundo segmento");
        int secondSegment = sc.nextInt();
        System.out.println("Digite o terceiro segmento");
        int thirdSegment = sc.nextInt();

        if ((firstSegment < secondSegment + thirdSegment) && (secondSegment < thirdSegment + firstSegment) && (thirdSegment < firstSegment + secondSegment)) {
            System.out.println("Pode formar um triangulo\n");
        } else {
            System.out.println("Não pode formar um triangulo\n");
        }

        if (( firstSegment == secondSegment && secondSegment == thirdSegment && thirdSegment == firstSegment)) {
            System.out.println("O Triangulo é um EQUILATERO");
        } else if ((firstSegment == secondSegment || secondSegment == thirdSegment || thirdSegment == firstSegment)) {
            System.out.println("O triangulo é um ISÓSCELES");
        } else {
            System.out.println("O triangulo é um ESCALENO");
        }
    }
}
