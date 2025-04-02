import java.util.Scanner;

public class JogoDaVerdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        System.out.println("🎙️ Bem-vindo ao Jogo da Verdade de Padrinhos Mágicos!");

        while (continuar) {
            System.out.println("\n👉 Vamos começar? Responda com 'sim' ou 'não'");
            String comecar = scanner.nextLine();

            if (comecar.equalsIgnoreCase("sim")) {

                System.out.println("\n🔹 Você já desejou ter padrinhos mágicos?");
                String resposta1 = scanner.nextLine();

                if (resposta1.equalsIgnoreCase("sim")) {
                    System.out.println("✔️ O sonho de todo mundo ter seus desejos realizados! Quem sabe um dia, não perca as esperanças...");
                } else {
                    System.out.println("🚨 Realista e pé no chão! Mas sonhar um pouco não faz mal a ninguém!");
                }

                System.out.println("\n🔹 Você sabe quem é a Vicky?");
                String resposta2 = scanner.nextLine();

                if (resposta2.equalsIgnoreCase("sim")) {
                    System.out.println("✔️ Uau, você realmente gosta do desenho!");
                } else {
                    System.out.println("📚 Anota aí: Vicky é a menina mais insuportável do desenho, é babá do Timmy!");
                }

                System.out.println("\n🔹 Você prefere Cosmo ou Wanda?");
                String resposta3 = scanner.nextLine();

                if (resposta3.equalsIgnoreCase("cosmo")) {
                    System.out.println("🎯 Um pouco atrapalhado, mas com enorme coração! O que seria daquele verdinho sem a Wanda, né?");
                } else if (resposta3.equalsIgnoreCase("wanda")) {
                    System.out.println("🧠 Prática, organizada e muito rosa! O que seria dela sem as gracinhas do Cosmo? Amamos!");
                } else {
                    System.out.println("😅 Hmmm... resposta criativa, tá valendo!");
                }

                System.out.println("\n🔁 Deseja jogar novamente? (sim/não)");
                String respostaContinuar = scanner.nextLine();
                continuar = respostaContinuar.equalsIgnoreCase("sim");

            } else {
                continuar = false;
            }
        }

        System.out.println("\n🎉 Obrigado por jogar o Jogo da Verdade! Até a próxima, Rafael Gostosão!");
        scanner.close();
    }
}
