import java.util.Scanner;

public class ExemploLoopWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        String continuar;

        {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            soma += numero;

            System.out.println("Deseja Continuar? (S/N): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("A soma dos números digitados é: " + soma);
        scanner.close();
    }
}
