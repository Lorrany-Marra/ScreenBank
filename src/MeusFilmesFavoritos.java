import java.util.Scanner;

public class MeusFilmesFavoritos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String filme1, filme2, filme3;
        double nota1, nota2, nota3;

        // Entrada de dados
        System.out.println("Digite o nome do seu 1º filme favorito:");
        filme1 = leitor.nextLine();

        System.out.println("Digite a nota para " + filme1 + ":");
        nota1 = leitor.nextDouble();
        leitor.nextLine(); // limpar quebra de linha

        System.out.println("Digite o nome do seu 2º filme favorito:");
        filme2 = leitor.nextLine();

        System.out.println("Digite a nota para " + filme2 + ":");
        nota2 = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Digite o nome do seu 3º filme favorito:");
        filme3 = leitor.nextLine();

        System.out.println("Digite a nota para " + filme3 + ":");
        nota3 = leitor.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3) / 3;
        int classificacao = (int) (media / 2); // casting para classificação de 0 a 5 estrelas

        // Exibição do resultado
        String resultado = """
            📝 Sua Lista de Favoritos:
            1. %s — Nota: %.1f
            2. %s — Nota: %.1f
            3. %s — Nota: %.1f
            
            🎯 Média geral: %.2f
            ⭐ Classificação: %d estrelas
            """.formatted(filme1, nota1, filme2, nota2, filme3, nota3, media, classificacao);

        System.out.println(resultado);
        leitor.close();
    }
}
