//  RESOLUÇÃO DESAFIO QUADRADOS PERFEITOS
import java.util.*;

public class QuadradosPerfeitos {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        List<Integer> quadradosPerfeitos = new ArrayList<>();
        int somaQuadrados = n;

        for(int i = 1; i <= n; i++){
          double raizQuadrada = Math.ceil(Math.sqrt(i));

          if(Math.pow(raizQuadrada, 2) == i){
            int quadradoPerfeito = i;
            quadradosPerfeitos.add(0, quadradoPerfeito);
          }
        }
        
        for(int j = 0; j < quadradosPerfeitos.size(); j++) {
          int entrada = n;
          int countQuadrados = 0;

          for(int k = j; k < quadradosPerfeitos.size(); k++) {
            while((entrada - quadradosPerfeitos.get(k)) >= 0) {
              entrada -= quadradosPerfeitos.get(k);
              countQuadrados++;
            }
          }
          
          if(countQuadrados < somaQuadrados) {
            somaQuadrados = countQuadrados;
          }
          
        }
              
        System.out.println(somaQuadrados);

    }
}
// RESOLUÇÃO DESAFIO QUADRADOS PERFEITOS END