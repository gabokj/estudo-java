import javax.swing.*;
import java.util.ArrayList;

class Remedio {
    private String nome;
    private String principioAtivo;
    private double preco;
    private int estoque;

    public Remedio(String nome, String principioAtivo, double preco, int estoque) {
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String mostrarDados() {
        return "Nome: " + nome +
               "\nPrincípio Ativo: " + principioAtivo +
               "\nPreço: R$ " + preco +
               "\nEstoque: " + estoque + " unidades\n";
    }
}

public class FarmaciaInterativa {
    public static void main(String[] args) {
        ArrayList<Remedio> remedios = new ArrayList<>();
        int opcao;

        do {
            String menu = "Farmácia - Menu de Opções\n\n"
                        + "1  Cadastrar Remédio\n"
                        + "2  Listar Remédios\n"
                        + "3  Alterar Dados de um Remédio\n"
                        + "4  Excluir Remédio\n"
                        + "5  Buscar Remédio (por nome ou princípio ativo)\n"
                        + "0  Sair\n\n"
                        + "Escolha uma opção:";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do remédio:");
                    String principioAtivo = JOptionPane.showInputDialog("Digite o princípio ativo:");
                    double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do remédio:"));
                    int estoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em estoque:"));

                    Remedio novoRemedio = new Remedio(nome, principioAtivo, preco, estoque);
                    remedios.add(novoRemedio);
                    JOptionPane.showMessageDialog(null, "Remédio cadastrado com sucesso!");
                    break;

                case 2:
                    if (remedios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum remédio cadastrado.");
                    } else {
                        String lista = "";
                        for (int i = 0; i < remedios.size(); i++) {
                            lista += "🔹 Código: " + i + "\n" + remedios.get(i).mostrarDados() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 3:
                    if (remedios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum remédio cadastrado para alterar.");
                    } else {
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do remédio que deseja alterar (consulte pelo menu 2):"));

                        if (codigo >= 0 && codigo < remedios.size()) {
                            Remedio r = remedios.get(codigo);

                            String[] opcoes = {"Nome", "Princípio Ativo", "Preço", "Estoque"};
                            String escolha = (String) JOptionPane.showInputDialog(null, "Qual dado deseja alterar?", "Alterar Dados", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

                            switch (escolha) {
                                case "Nome":
                                    r.setNome(JOptionPane.showInputDialog("Digite o novo nome:"));
                                    break;
                                case "Princípio Ativo":
                                    r.setPrincipioAtivo(JOptionPane.showInputDialog("Digite o novo princípio ativo:"));
                                    break;
                                case "Preço":
                                    r.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço:")));
                                    break;
                                case "Estoque":
                                    r.setEstoque(Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade em estoque:")));
                                    break;
                            }
                            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Código inválido.");
                        }
                    }
                    break;

                case 4:
                    if (remedios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum remédio cadastrado para excluir.");
                    } else {
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do remédio que deseja excluir (consulte pelo menu 2):"));

                        if (codigo >= 0 && codigo < remedios.size()) {
                            remedios.remove(codigo);
                            JOptionPane.showMessageDialog(null, "Remédio excluído com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Código inválido.");
                        }
                    }
                    break;

                case 5:
                    if (remedios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum remédio cadastrado.");
                    } else {
                        String termoBusca = JOptionPane.showInputDialog("Digite o nome ou princípio ativo para buscar:");
                        String resultado = "";
                        for (Remedio r : remedios) {
                            if (r.getNome().toLowerCase().contains(termoBusca.toLowerCase()) ||
                                r.getPrincipioAtivo().toLowerCase().contains(termoBusca.toLowerCase())) {
                                resultado += r.mostrarDados() + "\n";
                            }
                        }
                        if (resultado.equals("")) {
                            JOptionPane.showMessageDialog(null, "Nenhum remédio encontrado.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Remédios encontrados:\n\n" + resultado);
                        }
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
