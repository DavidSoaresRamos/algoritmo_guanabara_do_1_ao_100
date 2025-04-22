import java.util.Scanner;
public class entireNumber{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero");
        int entireNumberValue = sc.nextInt();
        int sucessor = entireNumberValue + 1;
        int predecessor = entireNumberValue - 1;
        System.out.printf("O antecessor de %d é %d e o sucessor é %d", entireNumberValue, predecessor, sucessor);
    }
}