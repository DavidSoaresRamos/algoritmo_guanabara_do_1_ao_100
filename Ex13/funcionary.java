// Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.
import java.util.Scanner;

public class funcionary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a remuneração do colaborador");
        int salary = sc.nextInt();
        int percent = salary * 15 / 100;
        int newSalary = salary + percent;
        System.out.printf("O novo salario do colaborador é %d", newSalary);
    }
}
