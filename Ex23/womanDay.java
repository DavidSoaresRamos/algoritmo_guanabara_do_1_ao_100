// 23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres. Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo que:
// - Homens ganham 5% de desconto
// - Mulheres ganham 13% de desconto

import java.util.Scanner;

public class womanDay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome");
        String name = sc.nextLine();
        System.out.println("Informe seu sexo");
        char sexuality = sc.next();
        System.out.println("Informe o valor da sua compra");
        int value = sc.nextInt();

    }
}
