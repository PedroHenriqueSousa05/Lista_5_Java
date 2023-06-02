import java.util.Scanner;
public class Lista5Exercicios9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numeoro:");
        int numero1 = scanner.nextInt();

        System.out.println(" O numero de trás para frente é: " + NumeroInverso(numero1));

        scanner.close();
        
    }

    public static String NumeroInverso(int numero1){
        String numeroEmLinha = String.valueOf(numero1);
        String numeroAoContrario = new StringBuilder(numeroEmLinha).reverse().toString();

        return numeroAoContrario;
    }
}