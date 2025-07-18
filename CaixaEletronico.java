import java.util.Scanner;

class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }
}

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta minhaConta = new Conta(1000.0);  // Saldo inicial de R$1000

        int opcao;

        do {
            System.out.println("\n=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: R$");
                    double saque = scanner.nextDouble();
                    minhaConta.sacar(saque);
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: R$");
                    double deposito = scanner.nextDouble();
                    minhaConta.depositar(deposito);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
