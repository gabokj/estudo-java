public class atv {
    String nome;
    int idade;
    String nome2;
    int idade2;

    public atv(String nome, int idade , String nome2, int idade2) {
        this.nome = nome;
        this.idade = idade;
        this.nome2 = nome2;
        this.idade2 = idade2;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade + " anos");
        System.out.println("Nome: " + nome2);
        System.out.println("Idade: " + idade2 + " anos");
    }

    public static void main(String[] args) {
        atv nomes = new atv ("Alex Monteiro", 35 , "Zequinha", 18 );

        System.out.println("Informações: ");
        nomes.exibirInformacoes();
    }
}

    

