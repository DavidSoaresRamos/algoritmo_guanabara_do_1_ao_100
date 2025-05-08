//  Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não vota


import java.util.Scanner;

public class person {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Em qual ano você nasceu?");
        int yearOfBirth = sc.nextInt();
        int age = 2025 - yearOfBirth;
System.out.printf("Sua idade é: %d \n", age);
        if (age >= 18){
            System.out.println("Parabens você tem permissão para votar");
        }
        else {
            System.out.println("Sinto muito voce ainda não esta na idade para ter o direito de votar");
        }
    }
}
