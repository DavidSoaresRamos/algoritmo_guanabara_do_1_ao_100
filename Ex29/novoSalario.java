//Desenvolva um programa que leia o nome de um funcionário, seu salário,
//quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
//acordo com a tabela a seguir:
// - Até 3 anos de empresa: aumento de 3%
// - entre 3 e 10 anos: aumento de 12.5%
// - 10 anos ou mais: aumento de 20

import java.util.Scanner;

public class novoSalario {
 public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Informe seu nome");
     String nome = sc.nextLine();
     System.out.println("Informe seu salario");
     int salario = sc.nextInt();
     System.out.println("Informe quantos anos trabalha na empresa");
     int anosNaEmpresa = sc.nextInt();

     System.out.printf("Parabens %s\n", nome);
     if (anosNaEmpresa < 3) {
         System.out.println("Seu novo salario é de: " + (salario + salario * 3 /100));
     } else if ((anosNaEmpresa > 3 ) && (anosNaEmpresa < 10)) {
         System.out.println("Seu novo salario é de: " + (salario + salario * 12.5 /100));
     } else { System.out.println("Seu novo salario é de: " + (salario + salario * 20 /100)); }

 }
}
