import java.util.Scanner;

public class contadeMais 
{
    public static void main(String[] args)
    {
        Scanner conta = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;

        System.out.print("Digite o primeiro numero: ");
        numero1 = conta.nextInt();

        System.out.print("Digite o segundo numero: ");
        numero2 = conta.nextInt();

        soma = numero1 + numero2;
        
        System.out.println("\nO resultado da soma é: " + soma);
    }
}   
    