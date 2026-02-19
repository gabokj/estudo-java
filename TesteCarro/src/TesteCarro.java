public class TesteCarro {
    public static void main (String[] args) {
        System.out.println("--- Criando e interagindo com o fusca ---");

        //Criando um obj da classe carro
        Carro meuFusca = new Carro();

        //Tentando acelerar sem ligar o carro
        System.out.println("\nTentando acelerar desligado...");
        meuFusca.acelerar(20);
        System.out.println("Velocidade atual: " + meuFusca.getVelocidade() + " km/h");

        //ligando o carro metodo public
        System.out.println("\n Agora vamos ligar o carro...");
        meuFusca.ligar();

        meuFusca.ligar(); //retorna que esta ligado

        System.out.println("\n Acelerando..");
        meuFusca.acelerar(15);
        meuFusca.acelerar(20);
        System.out.println("Velocidade atual: " + meuFusca.getVelocidade() + " km/h");

        System.out.println("\n Freando...");
        meuFusca.frear(10);

        System.out.println("Velocidade final: " + meuFusca.getVelocidade() + " km/h");
    }

}
