import java.util.Scanner;

public class Lista5Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Informe o terceiro numero: ");
        int numero3 = scanner.nextInt();
        

        scanner.close();
        System.out.println("A soma dos numeros é: " + SomarNumero(numero1, numero2, numero3));
    }

    public static int SomarNumero(int numero1, int numero2 , int numero3){
        return numero1 + numero2 + numero3;
    }
}
