import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Conversão para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // Exibe o resultado formatado com duas casas decimais
        System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", temperaturaFahrenheit);

        // Faz um casting para inteiro
        int temperaturaInteira = (int) temperaturaFahrenheit;

        // Exibe o valor inteiro da temperatura convertida
        System.out.println("Temperatura aproximada (inteiro): " + temperaturaInteira + "°F");

        scanner.close();
    }
}
