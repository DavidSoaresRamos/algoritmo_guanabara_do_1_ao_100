//Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou. 
//Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um fumante perderá e exiba o total em dias.

import java.util.Scanner;

public class smoker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Quantos cigarros você fuma por dia");
    int cigarretessmoked = sc.nextInt();
    System.out.println("A quantos anos voce fuma");
    int yearssmoked = sc.nextInt();
    int yearconvertforday = yearssmoked * 365;
    int lostminutes = 10;
    int calc = cigarretessmoked *  yearconvertforday * lostminutes ;
    int hourslost = calc / 60;
    int dayslost = hourslost / 24;
    System.out.printf("Voce ja perdeu %d dias de vida", dayslost);


    }
}
