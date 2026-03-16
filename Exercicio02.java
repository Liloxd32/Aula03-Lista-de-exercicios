// Nome: Davi Fernandes Alves
// Matrícula: 1261946667

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   Scanner scanner = new Scanner(System.in);

   System.out.println("Digite X: ");
    int x = scanner.nextInt();

    System.out.println("Digite Y: ");
    int y = scanner.nextInt();

    int resto = x % y;

    System.out.println("O resto da divisão de " + x + " por " + y + " é: " +resto);

    scanner.close();
    

    }
}
