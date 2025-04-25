// Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.
import java.util.Scanner;

public class workingDays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de dias trabalhados no mês");
        int daysWorked = sc.nextInt();
        int hoursWorkedPerDay = 8;
        int HourValue = 7;
        int salary = HourValue * hoursWorkedPerDay * daysWorked;
        System.out.printf("A remuneração do colaborador é de %d", salary);
    }
}
