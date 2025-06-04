import java.text.DecimalFormat;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //exibir menu
        System.out.println("\n=== Menu de Frutas ===");
        System.out.println("\n1- Morango ( R$ 40,00/Kg)");
        System.out.println("2- Banana ( R$ 4,98/Kg)");
        System.out.println("3- Goiaba ( R$ 9,99/Kg)");
        System.out.println("4- Maça ( R$ 11,98/Kg)");
        System.out.println("5- Uva ( R$ 9,00/Kg)");
        System.out.println("6- Laranja ( R$ 4,98/Kg)");
        System.out.println("===========================");

        //escolher fruta
        System.out.println("Escolha o número da Fruta desejada: ");
        int opcao = entrada.nextInt();
        entrada.nextLine();

        String nome = "";
        double valor_quilo = 0.0;

        switch (opcao) {
            case 1:
                nome = "Morango";
                valor_quilo = 40.00;
                break;
            case 2:
                nome = "Banana";
                valor_quilo = 4.98;
                break;
            
            case 3:
                nome = "Goiaba";
                valor_quilo = 9.99;
                break;
            
            case 4:
                nome = "Maça";
                valor_quilo = 11.98;
                break;   
            
            case 5:
                nome = "Uva";
                valor_quilo = 9.00;
                break; 

             case 6:
                nome = "Laranja";
                valor_quilo = 4.98;
                break; 

            default:
                System.out.println("Opção inválida!");
                entrada.close();
                return;
        }

        //pedir o peso
        System.out.println("Digite o peso da fruta (Kg): ");
        String pesoTexto = entrada.nextLine();
        pesoTexto = pesoTexto.replace(",", ".");
        double pesagem = Double.parseDouble(pesoTexto);

        double total = pesagem * valor_quilo;

        // Exibir nota fiscal formatada
        System.out.println("\n --- Nota fiscal ---");
        System.out.println("Nome da Fruta: " + nome);
        System.out.println("Peso da Fruta: " + pesagem + " Kg");
        System.out.println("Preço por quilo: R$ " + df.format(valor_quilo));
        System.out.println("Total a pagar: R$ " + df.format(total));

        entrada.close();
    }
}
