import javax.swing.JOptionPane;

public class Investimento {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String valorStr = JOptionPane.showInputDialog("Digite o valor investido (R$): ");
        String mesesStr = JOptionPane.showInputDialog("Digite o tempo do investimento em meses: ");

        try {
            valorStr = valorStr.replace(",", ".");
            float valorInvestido = Float.parseFloat(valorStr);

            int meses = Integer.parseInt(mesesStr);

            // Taxa Selic anual (14,90% = 0.149)
            double taxaAnual = 0.149;

            double taxaMensal = Math.pow(1 + taxaAnual, 1.0 / 12.0) - 1;
            double valorFinal = valorInvestido * Math.pow(1 + taxaMensal, meses);
            double rendimento = valorFinal - valorInvestido;

            String mensagem = "Nome: " + nome + "\n"
                            + "Valor investido: R$ " + String.format("%.2f", valorInvestido) + "\n"
                            + "Tempo: " + meses + " meses\n"
                            + "Taxa Selic anual: 14,90%\n"
                            + "Valor final: R$ " + String.format("%.2f", valorFinal) + "\n"
                            + "Rendimento obtido: R$ " + String.format("%.2f", rendimento);

            JOptionPane.showMessageDialog(null, mensagem, "Resultado do Investimento", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: entrada inválida. Digite valores numéricos corretos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
