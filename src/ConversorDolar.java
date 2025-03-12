import java.util.Scanner;

public class ConversorDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir taxa de conversão
        double taxaDeConversao = 4.94; // 1 USD = 4.94 BRL

        // Solicitar o valor em dólares
        System.out.print("Digite o valor em dólares (USD): ");
        double valorEmDolares = scanner.nextDouble();

        // Conversão para reais
        double valorEmReais = valorEmDolares * taxaDeConversao;

        // Exibir o resultado formatado
        System.out.printf("Valor em Reais: R$ %.2f%n", valorEmReais);

        // Faz um casting para inteiro
        int valorInteiro = (int) valorEmReais;

        // Exibir valor arredondado para inteiro
        System.out.println("Valor aproximado (inteiro): R$ " + valorInteiro);

        scanner.close();
    }
}
