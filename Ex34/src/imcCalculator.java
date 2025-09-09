import java.util.Scanner;

class imcCalculator {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu peso:");
        double weight = sc.nextDouble();
        System.out.println("Informe a sua altura:");
        double height = sc.nextDouble();

        double imc = weight / (height * height);

        System.out.printf("O seu IMC é de: %.2f", imc);
    }
}