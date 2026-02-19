public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado= false;
        this.velocidade=0;
        this.marcha=0;
        System.out.println("um novo carro foi criado, está desligado e parado.");
    }

    public void ligar() {
        if (!this.ligado) {
            this.ligado=true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void  acelerar(int aumento) {
        if (ligado && aumento >0) {
            this.velocidade += aumento;
            System.out.println("VRUMM! Velocidade atual: " + this.velocidade + "km/h");
            atualizarMarcha();
        } else {
            System.out.println("Não é possivel acelerar. O carro está desligado ou o valor é inválido!");
        }
    }
    public void frear(int reducao) {
        if (ligado && reducao > 0) {
            this.velocidade -= reducao;
            if (this.velocidade <0) {
                this.velocidade = 0;
            }
            System.out.println("Freando... Velocidade atual: "+ this.velocidade + " km/h");
            atualizarMarcha();
        }
    }

    private void  atualizarMarcha() {
        if (this.velocidade == 0) this.marcha = 0;
        else if (this.velocidade < 20) this.marcha =1;
        else if (this.velocidade < 40) this.marcha = 2;
        else this.marcha = 3;
        System.out.println("---> Marcha atual: " + this.marcha);
    }

    public int getVelocidade(){
        return  this.velocidade;
    }

    public boolean isLigado() {
        return this.ligado;
    }



}