import java.util.Scanner;

public class Pintura_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a marca do carro (Ford, Fiat, Chevrolet ou Renault): ");
        String marca = scanner.nextLine();

        String cor;

        if (marca.equalsIgnoreCase("Ford")) {
            cor = "Vermelho";
        } else if (marca.equalsIgnoreCase("Fiat")) {
            cor = "Azul";
        } else if (marca.equalsIgnoreCase("Chevrolet")) {
            cor = "Preto";
        } else if (marca.equalsIgnoreCase("Renault")) {
            cor = "Cinza";
        } else {
            cor = "cor indefinida! (marca não conhecida no sistema)";
        }
        System.out.println("O carro da marca " + marca + " será pintado da cor " + cor + ".");

        scanner.close();
    }
}