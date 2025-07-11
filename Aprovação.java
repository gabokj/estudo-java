import java.util.Scanner;

public class Aprovação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite a nota do aluno " + i + ":");
            double nota = scanner.nextDouble();

            if (nota >=6) {
                System.out.println("Aluno " + i + ": Aprovado!");
            } else if (nota >= 5) {
                System.out.println("Aluno " + i + ": Recuperção!");
            } else {
                System.out.println("Aluno " + i + ": Reprovado!");
            }

        }

        scanner.close();
    }
}
