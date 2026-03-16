// Nome: Davi Fernandes Alves
// Matrícula: 1261946667

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       final double COTACAO = 4.95;

       System.out.println("digite o valor em dólar: ");
       double dolar = scanner.nextDouble();

       double reais = dolar * COTACAO;

       System.out.printf("Valor convertido: R$ %.2f\\n", reais);

       scanner.close();
       
    }
}
