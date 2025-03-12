import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Mensagem personalizada baseada na idade
        if (idade < 18) {
            System.out.println("Olá " + nome + ", você é menor de idade! 🚀");
        } else {
            System.out.println("Olá " + nome + ", você é maior de idade! 🎉");
        }

        scanner.close();
    }
}

