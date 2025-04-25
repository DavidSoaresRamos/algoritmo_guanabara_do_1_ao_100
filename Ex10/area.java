// Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma área de 2metros quadrados.

import java.util.Scanner;

public class area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a largura");
        double width = sc.nextDouble();
        System.out.println("informe a altura");
        double height = sc.nextDouble();
        double areaValue = width * height;
        double paint = 2;
        double paintArea = areaValue / paint;

        System.out.printf("A area de %f necessita de %f litros de tinta", areaValue, paintArea);

    }
}
