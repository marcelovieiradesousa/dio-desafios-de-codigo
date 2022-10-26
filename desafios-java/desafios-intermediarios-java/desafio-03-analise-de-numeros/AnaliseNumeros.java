//  RESOLUÇÃO DESAFIO ANÁLISE DE NÚMEROS
import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros {
	
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int qntPar = 0;
        int qntImpar = 0;
        int qntPositivo = 0;
        int qntNegativo = 0;
        
        while (leitor.hasNextInt()) {
            int entrada = leitor.nextInt();
            if (entrada % 2 == 0) qntPar++;
            if (entrada % 2 != 0) qntImpar++;
            if (entrada > 0) qntPositivo++;
            if (entrada < 0) qntNegativo++;
        }

        System.out.println( qntPar + " par(es)");
        System.out.println( qntImpar + " impar(es)");
        System.out.println( qntPositivo + " positivo(s)");
        System.out.println( qntNegativo + " negativo(s)");

        leitor.close();

    }	
}
// RESOLUÇÃO DESAFIO ANÁLISE DE NÚMEROS END 
