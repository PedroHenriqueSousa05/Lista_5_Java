import java.util.Scanner;

public class Lista5Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int numero1 = scanner.nextInt();
        scanner.close();
        Contar(numero1);
    }

    public static void Contar(int maximo){
        int contador = 0;

        while(contador <= maximo){
            contador++;
            System.out.print("(");
            for(int i = 1; i <= contador; i++){
                System.out.print(contador + ",");     
            }
            System.out.println(")");

        }
        
    }
}
