import java.util.Scanner;

public class pesagem {
    public static void main(String[] args) {
        //cria um scanner para ler dados do usuario
        Scanner entrada = new Scanner(System.in);

        //pedir o nome da fruta
        System.out.println("Digite o nome da Fruta: ");
        String nome = entrada.nextLine();

        //pedir o peso da fruta
        System.out.println("Digite o peso da Fruta (Kg): ");
          String pesoTexto = entrada.nextLine();
        pesoTexto = pesoTexto.replace(",", ".");
        double pesagem = Double.parseDouble(pesoTexto);


        //pedir valor por quilo
        System.out.println("Digite o valor do quilo (R$): ");
         String valorTexto = entrada.nextLine();
        valorTexto = valorTexto.replace(",", ".");
        double valor_quilo = Double.parseDouble(valorTexto);

        //caucular o valor total
        double total = pesagem * valor_quilo;

        //resumo da compra
        System.out.println("\n --- Nota fiscal ---");
        System.out.println("Nome da Fruta: " + nome);
        System.out.println("Peso da Fruta: " + pesagem + " Kg");
        System.out.println("Preço por quilo: R$ " + valor_quilo);
        System.out.println("Total a pagar: R$ " + total);
        
        //fechar scanner
        entrada.close();
    }
}
