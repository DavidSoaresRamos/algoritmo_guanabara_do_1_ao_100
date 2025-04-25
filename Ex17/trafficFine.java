//Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
import java.util.Scanner;

public class trafficFine {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a velocidade do carro");
        int kmh = sc.nextInt();
        int kmhAboveTheVelocity = kmh - 80;
        int value = kmhAboveTheVelocity * 5;
        System.out.printf("Km/h: %d \n", kmh);
        System.out.printf("Valor da multa: %d \n", value);

        if (kmh >= 80) {
            System.out.println("Voce foi multado \n");
        }
        else {
            System.out.println("Voce esta dentro da velocidade permitida");
        }
    }
}
