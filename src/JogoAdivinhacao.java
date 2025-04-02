import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random gerador = new Random();

        int numeroSecreto = gerador.nextInt(101);
        int tentativas = 5;
        int tentativaAtual = 0;

        System.out.println("🎯 Tente adivinhar o número secreto de 0 a 100!");
        System.out.println("Você tem " + tentativas + " tentativas!");

        while (tentativaAtual < tentativas) {
            System.out.print("\nDigite sua tentativa #" + (tentativaAtual + 1) + ": ");
            int palpite = leitura.nextInt();

            tentativaAtual++;

            if (palpite == numeroSecreto) {
                System.out.println("💚 Acertou, maravilhosa! O número era " + numeroSecreto);
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("❄️ O número é MAIOR!");
            } else {
                System.out.println("🔥 O número é MENOR!");
            }

            if (tentativaAtual == tentativas) {
                System.out.println("\n💀 Game Over! O número era: " + numeroSecreto);
            }
        }

        leitura.close();
    }
}
