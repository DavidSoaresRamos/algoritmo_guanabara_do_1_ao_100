//Faça um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua área em m². O programa também
//devemostrar a classificação desse terreno, de acordo com a lista abaixo:
// - Abaixo de 100m² = TERRENO POPULAR
// - Entre 100m² e 500m² = TERRENO MASTER
// - Acima de 500m² = TERRENO VIP

import java.util.Scanner;

public class classificacaoDoTerreno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a largura do terreno");
        int largura = sc.nextInt();
        System.out.println("Informe o comprimento de um terreno");
        int comprimento = sc.nextInt();
        int area = largura * comprimento;

        System.out.printf("A area do terreno é de %dm²\n", area);
        if (area < 100) {
            System.out.println("TERRENO POPULAR");
        } else if ((area > 100) && (area < 500)) {
            System.out.println("TERRENO MASTER");
        } else {
            System.out.println("TERRENO VIP");
        }
    }
}
