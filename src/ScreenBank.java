import java.util.Scanner;

public class ScreenBank {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("==== Bem-vindo ao ScreenBank ====");
        System.out.print("Digite seu nome: ");
        String nomeCliente = leitura.nextLine();

        System.out.print("Informe o tipo da conta (Corrente ou Poupança): ");
        String tipoConta = leitura.nextLine();

        System.out.print("Informe seu saldo inicial: R$ ");
        double saldo = leitura.nextDouble();

        int opcao = 0;

        System.out.println("\n-----------------------------------");
        System.out.println("Olá, " + nomeCliente + "!");
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo inicial: R$ %.2f%n", saldo);
        System.out.println("-----------------------------------");

        while (opcao != 4) {
            System.out.println("\n========== MENU ==========");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor a receber: R$ ");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Valor recebido com sucesso!");
                    break;
                case 3:
                    System.out.print("Digite o valor para transferir: R$ ");
                    double valorTransferencia = leitura.nextDouble();
                    if (valorTransferencia > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println("Transferência realizada!");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o sistema. Obrigado por usar o ScreenBank!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        leitura.close();
    }
}
