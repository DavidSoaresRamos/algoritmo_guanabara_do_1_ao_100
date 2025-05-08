// /Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.


import java.util.Scanner;

public class funcionario {
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Informe o nome do funcionario");
    String name = sc.nextLine();
    System.out.println("Informe o salario do funcionario");
    int salary = sc.nextInt();
    System.out.printf("O funcionario %s tem um salario de R$%d", name, salary );
    }
}
