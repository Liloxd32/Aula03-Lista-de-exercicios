// Nome: Davi Fernandes Alves
// Matrícula: 1261946667

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner scanner = new Scanner(System.in);

     System.out.println("Digite o salário atual: ");
     double salario = scanner.nextDouble();

     double novosalario = salario * 1.07;

     System.out.printf("Salario Original: R$ %.2f\n", salario);
     System.out.printf("Novo Salário: R$ %.2f\n", novosalario);

     scanner.close();

    }
}
