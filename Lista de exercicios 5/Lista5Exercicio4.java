import java.util.Scanner;

public class Lista5Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeior valor: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double numero3 = scanner.nextDouble();

        System.out.printf("A media Aritimética dos números é: %.2f \n", MediaAritimetica(numero1, numero2, numero3) );
        System.out.printf("A media Harmônica dos números é: %.2f \n", MediaHarmonica(numero1, numero2, numero3) );
        System.out.printf("A media Geometrica dos números é: %.2f \n", MediaGeometrica(numero1, numero2, numero3));

        scanner.close();
    }
    public static double MediaAritimetica(double numero1, double numero2, double numero3){
        double media = (numero1 + numero2 + numero3) / 3;
        return media;
    }
    public static double MediaHarmonica(double numero1, double numero2, double numero3){
        double media = 3 / ((1 / numero1) + (1 / numero2) + (1 / numero3));
        return media;
    }
    public static double MediaGeometrica(double numero1, double numero2, double numero3){
        double media = Math.sqrt((numero1 * numero2 * numero3));
        return media;
    }


}
