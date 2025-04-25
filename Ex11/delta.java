import java.util.Scanner;

public class delta {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor de A");
    int A = sc.nextInt();
    System.out.println("Digite o valor de B");
    int B = sc.nextInt();
    System.out.println("Digite o valor de C");
    int C = sc.nextInt();
    int delta = B * B - 4 * A * C;
 System.out.println(delta);
 }
}