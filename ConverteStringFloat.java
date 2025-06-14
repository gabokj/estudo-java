import java.util.Scanner;

public class ConverteStringFloat {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma String que representa um número: ");
        String numString = scanner.nextLine();

        try{
            float numFloat = Float.parseFloat(numString);
            System.out.println("O valor em formato de Float é: " + numFloat);
            } catch(NumberFormatException e) {
                System.out.println("A string não é um número válido.");
            }
    }
}
