import javax.swing.JOptionPane;

public class Transformar {
    public static void main(String[] args) {
        
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
        
        
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor:");

        int numero1 = Integer.parseInt(valor1.trim());
        int numero2 = Integer.parseInt(valor2.trim());

   
        String mensagem = "Você digitou os valores:\n" +
                          "Primeiro número: " + numero1 + "\n" +
                          "Segundo número: " + numero2;

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
