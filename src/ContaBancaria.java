import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        String nomeCliente = "Lorrany Marra";
        String tipoConta = "Corrente";
        double saldo = 3300000;


        Scanner leitura = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("************************************");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n*** Menu ***");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.print("Informe o valor a receber: R$ ");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Saldo atualizado: R$ " + saldo);
            } else if (opcao == 3) {
                System.out.print("Informe o valor da transferência: R$ ");
                double valorTransferencia = leitura.nextDouble();

                if (valorTransferencia > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Transferência realizada. Saldo atualizado: R$ " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Encerrando... obrigado por usar o ScreenBank");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        leitura.close();
    }
}
