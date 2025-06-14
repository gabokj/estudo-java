import javax.swing.JOptionPane;

public class somaSalario {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String idadeStr = JOptionPane.showInputDialog("Digite a sua idade: ");

        String salarioJunhoStr = JOptionPane.showInputDialog("Digite o sálario do mês de junho: ");
        String salarioJulhoStr = JOptionPane.showInputDialog("Digite o sálario do mês de julho: ");

        try{
            int idade = Integer.parseInt(idadeStr);

            salarioJunhoStr = salarioJunhoStr.replace(",", ".");
            salarioJulhoStr = salarioJulhoStr.replace(",", ".");

            float salarioJunho = Float.parseFloat(salarioJunhoStr);
            float salarioJulho = Float.parseFloat(salarioJulhoStr);

            float soma = salarioJunho + salarioJulho;

            String mensagem = "Nome" + nome + "\n"
                            + "Idade" + idade + " anos\n"
                            + "Salário Junho: R$" + String.format("%.2f", salarioJunho) + "\n"
                            + "Salário Julho: R$" + String.format("%.2f", salarioJulho) + "\n"
                            + "Soma dos sálario é: R$" + String.format("%.2f", soma);
            
            JOptionPane.showMessageDialog(null,mensagem, "Informações do Usuário", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: entrada inválida. Digite valores númericos corretos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
