//A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte a 
//quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. 
//Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

import java.util.Scanner;

public class rentalCompany {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos KM foram percorridos?");
        int kilometer = sc.nextInt();
        System.out.println("Por quantos dias o carro foi utilizado");
        int days = sc.nextInt();
        int dayValue =days * 90;
        double priceByKilometer = kilometer * 0.20;
        double finalValue = dayValue + priceByKilometer;
        System.out.printf("O valor total do uso foi de %.2f", finalValue);
    }
}
