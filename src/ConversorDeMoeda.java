import java.util.Scanner;

public class ConversorDeMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taxas de conversão (valores fictícios, podem ser atualizados)
        double taxaDolar = 5.20;  // 1 USD = 5.20 BRL
        double taxaEuro = 5.50;   // 1 EUR = 5.50 BRL
        double taxaLibra = 6.30;  // 1 GBP = 6.30 BRL

        // Solicita ao usuário o valor em Reais
        System.out.print("Digite o valor em Reais (R$): ");
        double valorReais = scanner.nextDouble();

        // Conversões
        double valorDolar = valorReais / taxaDolar;
        double valorEuro = valorReais / taxaEuro;
        double valorLibra = valorReais / taxaLibra;

        // Exibir os resultados formatados
        System.out.printf("Valor em Dólares: USD %.2f%n", valorDolar);
        System.out.printf("Valor em Euros: EUR %.2f%n", valorEuro);
        System.out.printf("Valor em Libras: GBP %.2f%n", valorLibra);

        scanner.close();
    }
}
