// Nome: Davi Fernandes Alves
// Matrícula: 1261946667

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero:");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("Adição: "+ soma);
        System.out.println("Subtração:" + subtracao);
        System.out.println("Multiplicação:" + multiplicacao);
        System.out.println("Divisão:" + divisao);

        scanner.close();



    }
}
