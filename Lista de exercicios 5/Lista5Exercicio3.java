import java.util.Scanner;

public class Lista5Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        int temperatura = scanner.nextInt();

        System.out.println("Essa temperatura em graus celsius é aproximadamente: " + Conversor(temperatura));
        scanner.close();
    }

    public static double Conversor(double temp){
        double celsius = (temp - 32) / 1.8;
        return Math.round(celsius);
    }
}
