//  Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
//  - O primeiro valor é o maior
//  - O segundo valor é o maior
//  - Não existe valor maior, os dois são iguais

import java.util.Scanner;

public class numerosInteiros {
 public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Informe o primeiro valor");
     int primeiroValor = sc.nextInt();
     System.out.println("Informe o primeiro valor");
     int segundoValor = sc.nextInt();

     if (segundoValor < primeiroValor ) {
         System.out.println("O primeiro valor é o maior");
     } else if (primeiroValor == segundoValor) {
         System.out.println("Não existe valor maior, os dois são iguais");
     } else {
         System.out.println("O segundo valor é o maior");
     }
 }
}
