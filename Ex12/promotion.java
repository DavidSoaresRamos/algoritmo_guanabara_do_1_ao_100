// Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.
import java.util.Scanner;

public class promotion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preço do produto");
        double value = sc.nextDouble();
        double valueDescont = value * 5 / 100;
        double valuePromotion = value + valueDescont;
        System.out.printf("O valor promocional do produto é %f", valuePromotion);
    }
}
