//  RESOLUÇÃO DESAFIO IDADES
import java.io.IOException;
import java.util.Scanner;

public class  Desafio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int cont = 0;
        int n = 0;
        double soma = 0;
        
        do {
            n = leitor.nextInt();
            if (n > 0) {
              cont++;
              soma += n;
            }
        } while (n > 0);
        
        
        double media = soma / cont;
        
        System.out.println(String.format("%.2f", media));
    }
	
}
// RESOLUÇÃO DESAFIO IDADES END 
