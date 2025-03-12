import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as notas do usuário
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2) / 2;

        // Exibe o resultado formatado com duas casas decimais
        System.out.printf("Média das notas: %.2f%n", media);

        // Faz um casting para inteiro
        int mediaInteira = (int) media;

        // Exibe a média arredondada para inteiro
        System.out.println("Média arredondada (inteiro): " + mediaInteira);

        scanner.close();
    }
}
