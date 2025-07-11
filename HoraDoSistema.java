import java.util.Date; //classe recomendada desde o java 8

public class HoraDoSistema {
    public static void main(String[] args) {
        Date data = new Date(); // Data e hora local
        System.out.println("A hora do sistema é ");
        System.out.println(data.toString());
    }
}
