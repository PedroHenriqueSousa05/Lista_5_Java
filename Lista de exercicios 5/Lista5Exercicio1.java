import java.util.Scanner;

public class Lista5Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("informe o segundo número: ");
        double numero2 = scanner.nextDouble();

        double mediaAritimetica = MediaAritimetica(numero1, numero2);

        System.out.println("A média a aritimética desses dois números é: " + mediaAritimetica);
        scanner.close();
    }

    public static double MediaAritimetica(double numero1, double numero2){
        double media = (numero1 + numero2) / 2;
        return media;
    }
}