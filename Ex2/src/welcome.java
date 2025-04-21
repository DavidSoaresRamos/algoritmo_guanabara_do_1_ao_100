import java.util.Scanner;

public class welcome {
 public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
      System.out.println("Qual é o seu nome?");
     String name = sc.nextLine();
      System.out.printf("Olá %s, é um prazer te conhecer!", name);
 }
}