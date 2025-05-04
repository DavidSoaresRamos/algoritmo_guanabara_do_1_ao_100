import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano");
            int leapYearValue = sc.nextInt();
            int operation = leapYearValue % 4;
            String operationResult = ((operation == 0 && leapYearValue % 100 != 0)) || (leapYearValue % 400 == 0) ? "O ano é bissexto" : "O ano não é bissexto";
            System.out.println(operationResult);
    }
}
