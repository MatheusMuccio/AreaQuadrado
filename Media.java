import java.util.Scanner;


public class Media {
    public static void main(String[] args){

        double n1;
        double n2;
        double media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextDouble();

        media = (n1 + n2) / 2.0;

        System.out.printf("Média = %.2f", media );

    }
}
