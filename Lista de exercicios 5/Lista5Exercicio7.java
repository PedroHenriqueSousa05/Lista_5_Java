import java.util.Scanner;

public class Lista5Exercicio7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor chave para proceseguir: ");
    int numeroDigitado = scanner.nextInt();

    System.out.println(Validador(numeroDigitado));
    scanner.close();
    }
     
    
    public static String Validador(int valor){
        if(valor == 5){
            return "P";
        }
        else
            return "N";
        }   
}
