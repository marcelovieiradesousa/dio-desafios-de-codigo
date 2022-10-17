//  RESOLUÇÃO DESAFIO SOMANDO MÚLTIPLOS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, N, somaMultiplos;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        somaMultiplos = 0;

        for (int i = 0; i <= N; i++) {
          if (i % A == 0){
            int multiplo = i;
            somaMultiplos+= multiplo;
          }
        }
        
        System.out.println(somaMultiplos);
    }
}
// RESOLUÇÃO DESAFIO SOMANDO MÚLTIPLOS END