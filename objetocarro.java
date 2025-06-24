public class objetocarro {
    String marca;
    String modelo;
    int ano;
    double preco;

    public objetocarro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preçp: " + preco);
    }

    public static void main(String[] args) {
        objetocarro meucarro = new objetocarro("Toyota", "Corolla", 2025, 124000.00);

        System.out.println("Informações do carro: ");
        meucarro.exibirInformacoes();
    }
}
