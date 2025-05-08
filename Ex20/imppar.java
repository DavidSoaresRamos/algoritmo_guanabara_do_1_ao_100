//Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.

import java.util.Scanner;

public class imppar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int number = sc.nextInt();
        int operation = number % 2;
        String operationResult = operation == 0 ? "O numero é par" : "O numero é impar";
        System.out.println(operationResult);
    }
}
