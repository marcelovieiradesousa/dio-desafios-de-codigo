//  RESOLUÇÃO DESAFIO SEIS NÚMEROS ÍMPARES */
import java.io.IOException;
import java.util.Scanner;

public class SeisNumerosImpares {
	
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;

        while (cont < 6) {
        	if (x % 2 != 0) {
        		System.out.println(x);
        		cont++;
        	}
        	x++;
        }

        leitor.close();

    }
	
}
// RESOLUÇÃO DESAFIO SEIS NÚMEROS ÍMPARES END 