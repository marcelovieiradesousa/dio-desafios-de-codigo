//  RESOLUÇÃO DESAFIO PREENCHIMENTO DE VETOR II
import java.util.Scanner; 

public class PreenchimentoVetor {
    
public static void main(String[] args){ 

    Scanner leitor = new Scanner(System.in); 
    int t = leitor.nextInt(); 
   
    int[] n = new int[1000];
    int i = 0;
    
    while(i < n.length){
      for(int x = 0; x < t; x++){
        if(i < n.length){
            n[i] = i;
            System.out.println("N[" + n[i] + "] = "+ x);
            i++;
        }
      }
    }

    leitor.close();

  }
}
// RESOLUÇÃO DESAFIO PREENCHIMENTO DE VETOR II END