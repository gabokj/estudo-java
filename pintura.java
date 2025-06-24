
import javax.swing.JOptionPane;

public class pintura {
    public static void main(String[] args) {
       
        String marca = JOptionPane.showInputDialog("Digite a marca do carro (Ford, Fiat, Chevrolet ou Renault)");

        String cor;

        if ((marca.equalsIgnoreCase("Ford"))) {
            cor = "Vermelho";
        } else if (marca.equalsIgnoreCase("Fiat")) {
            cor = "Azul";
        } else if (marca.equalsIgnoreCase("Chevrolet")) {
            cor = "Preto";
        } else if (marca.equalsIgnoreCase("Renault")) {
            cor = "Cinza";
        } else {
            cor = ("cor indefinida! (marca não conhecida no sistema).");
        }

        JOptionPane.showMessageDialog(null,"O carro da marca "+ marca + " Será pintado dar cor " + cor + ".");
    }
}
