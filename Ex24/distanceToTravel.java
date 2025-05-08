// Faça um algoritmo que pergunte a distância que um passageiro deseja
// percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
// viagens até 200Km e R$0.45 para viagens mais longas.


import java.util.Scanner;

public class distanceToTravel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a distancia que deseja percorrer em KM");
        double kilometer = sc.nextDouble();
         if (kilometer <= 200) {
             System.out.println("Valor total R$" + kilometer * 0.50);
         } else if (kilometer > 200) {
             System.out.println("Valor total R$" + kilometer * 0.45);
         }

    }
}

