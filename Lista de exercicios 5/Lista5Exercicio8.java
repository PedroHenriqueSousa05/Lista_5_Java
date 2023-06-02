import java.util.Scanner;

public class AtividadeOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            double taxaImposto = 20;

            System.out.println("Digite o valor do produto e será aumentado 20% de imposto");
            double custo = scanner.nextDouble();

            double custoProdutoComImposto = somaImposto(taxaImposto, custo);

            System.out.println("Custo com imposto: " + custoProdutoComImposto);
        
        scanner.close();
    }

    public static double somaImposto(double taxaImposto, double custo) {
        
        double imposto = custo * (taxaImposto / 100);
        
        double custoProdutoComImposto = custo + imposto;
        return custoProdutoComImposto;
    }
}    
