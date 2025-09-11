import java.util.Scanner;

class imcCalculator {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu peso:");
        double weight = sc.nextDouble();
        System.out.println("Informe a sua altura:");
        double height = sc.nextDouble();

        double imc = weight / (height * height);

        System.out.printf("O seu IMC é de: %.2f ", imc);

        if (imc < 18.5) {
            System.out.println("\n Abaixo do peso");
        } else if ((imc >= 18.5) && (imc < 25)) {
            System.out.println("\n Peso Ideal");
        } else if ((imc >= 25) && ( imc < 30)) {
            System.out.println("\n Sobrepeso");
        } else if ((imc >= 30) && (imc < 40)) {
            System.out.println("\n Obesidade");
        } else if (imc > 40) {
            System.out.println("\n Obesidade mórbida");
        }
    }
}