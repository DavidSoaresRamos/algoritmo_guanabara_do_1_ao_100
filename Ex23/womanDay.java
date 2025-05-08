
// Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres. 
// Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo que:
// - Homens ganham 5% de desconto
// - Mulheres ganham 13% de desconto

import java.util.Scanner;

public class womanDay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome");
        String name = sc.nextLine();
        System.out.println("Informe sua sexualidade");
        String sexuality = sc.nextLine();
        System.out.println("Informe o valor da sua compra");
        int purchaseValue = sc.nextInt();
        System.out.printf("Nome: %s\n" , name);
        if (sexuality.equals("Masculino")) {
            System.out.printf("Valor da compra: %d", purchaseValue - (purchaseValue * 5 / 100));
        } else if (sexuality.equals("Feminino")) {
            System.out.printf("Valor da compra: %d", purchaseValue - (purchaseValue * 13 / 100));
        }

    }
}
