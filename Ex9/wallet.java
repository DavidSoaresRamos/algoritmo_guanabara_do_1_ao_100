// Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

import java.util.Scanner;
public class wallet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em real que possui");
        double real = sc.nextDouble();
        double dolar = 3.45;
        double conversor = real * dolar;
        System.out.printf("O valor em dolar que possui é %f", conversor);
    }
}
