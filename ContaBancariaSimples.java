import java.util.Scanner;

public class ContaBancariaSimples
 {
    private double saldo;

    public ContaBancariaSimples(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancariaSimples conta = new ContaBancariaSimples(saldoInicial);

        System.out.print("Informe o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();

        conta.sacar(valorSaque);

        System.out.println("Saldo atual: R$" + conta.getSaldo());

        scanner.close();
    }
}