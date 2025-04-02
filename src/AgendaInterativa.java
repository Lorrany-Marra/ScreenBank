import java.util.Scanner;

public class AgendaInterativa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("🗓️ Bem-vinda à sua Agenda Java!");
        System.out.print("Quantas tarefas você quer cadastrar hoje? ");
        int quantidade = entrada.nextInt();
        entrada.nextLine(); // Consumir quebra de linha

        String[] tarefas = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a tarefa " + (i + 1) + ": ");
            tarefas[i] = entrada.nextLine();
        }

        System.out.println("\n✨ Aqui está sua agenda do dia:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("✅ " + tarefas[i]);
        }

        entrada.close();
    }
}
