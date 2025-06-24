import java.util.Scanner;

public class prepararcafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você quer um café com ou sem açúcar? (sim/não)");

        String resposta = scanner.nextLine();

        if ((resposta.equalsIgnoreCase("sim"))) {
            System.out.println("Preparando um café com açúcar...");
        } else if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao"))   {   
            System.out.println("Preparando um café sem açúcar...");
        } else {
            System.out.println("Resposta inválida. Por favor, reponda 'sim' ou 'não'.");
        }

        scanner.close();
    }
}
