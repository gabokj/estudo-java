public class notaa {
    public static void main(String[] args) {
        String[] nome = {"Aline", "Mario", "Sergio", "Shirley"};
        double[] notas = {9, 10, 4.5, 7};
        System.out.println("Aluno (a)  Nota");
        System.out.println("========== =====");

         for (int i = 0; i < nome.length; i++) {
            System.out.printf("%-10s %.1f%n", nome[i], notas[i]);
        }
    }
}
