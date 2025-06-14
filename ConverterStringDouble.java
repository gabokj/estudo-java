import java.util.Scanner;

public class ConverterStringDouble {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite uma String que representa um número: ");
        String numString = scanner.nextLine();

        try{
            double numDouble = Double.parseDouble(numString);
            System.out.println("O valor em formato Double é: " + numDouble);
        } catch (NumberFormatException e) {
            System.out.println("A string digitada não é um número válido.");
        }

        scanner.close();
    }
}
