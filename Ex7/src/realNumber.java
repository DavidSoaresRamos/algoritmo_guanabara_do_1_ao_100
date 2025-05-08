//Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.

import java.util.Scanner;
 
public class realNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        float realNumberValue = sc.nextFloat();
        float doubleValue = realNumberValue * 2;
        float thirdPart = realNumberValue / 3;

        System.out.printf("O numero %f tem como seu dobro %f e sua terça parte %f", realNumberValue, doubleValue, thirdPart);
    }
}
