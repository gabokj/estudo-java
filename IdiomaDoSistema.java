import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) throws InterruptedException { // código que chama Thread.sleep()
    
        System.out.println("\n=== Conferir Idioma Local ===");
        System.out.println("\n");

        for (int i = 0; i <= 100; i++) {
            
            System.out.print("\rCarregando... " + i + "%"); // \r para retornar ao início da linha e sobrescrever o texto
            Thread.sleep(10); // pausa de 10ms para animar a contagem
        }
        
        System.out.println("\n");

        Locale localizacao = Locale.getDefault();
        String codigoidioma = localizacao.getLanguage();
        String idioma = localizacao.getDisplayLanguage();

        System.out.println("\nCódigo do Idioma: " + codigoidioma);
        System.out.println("Nome do Idioma: " + idioma);
        System.out.println("\n");
    }
}
