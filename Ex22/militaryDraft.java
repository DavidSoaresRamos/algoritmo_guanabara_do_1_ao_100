import java.util.Scanner;

public class militaryDraft {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento");
        int yearOfBirth = sc.nextInt();
        int operation = 2025 - yearOfBirth;
        int yearsAfterMilitaryDraft = operation - 18;
        int yearsBeforeMilitaryDraft = 18 - operation;
        if (operation < 18) {
            System.out.printf("Voce ainda não precisa se alistar pois faltam %d anos", yearsBeforeMilitaryDraft);
        }
        else if (operation == 18) {
            System.out.println("Voce ja esta na idade para se alistar");
        }
        else {
            System.out.printf("Voce ja passou da idade para se alistar em %d anos", yearsAfterMilitaryDraft);
        }

    }
}
