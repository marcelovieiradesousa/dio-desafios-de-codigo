//  RESOLUÇÃO DESAFIO BUSCA SEQUENCIAL
import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        
        int number = leitor.nextInt();

        int i;
        
        for (i = 0; i < elementos.length; i++) {
          if(elementos[i] == number) {
            System.out.println("Achei " + number + " na posicao " + i);
            break;
          }
        }
        
        if (i == elementos.length){
          System.out.println("Numero " + number + " nao encontrado!");
        }
        
    }
}
// RESOLUÇÃO DESAFIO BUSCA SEQUENCIAL END