//  RESOLUÇÃO DESAFIO FATORIAL DESAJEITADO
import java.util.*;

public class FatorialDesajeitado {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int result = 0;
        int temp = n;
        
        List<Integer> numsFactorial = new ArrayList<>();
        
        for(int i = 0; n >= i ; i++) numsFactorial.add(i);
        n--;
        
        while(n > 0) {
          temp *= numsFactorial.get(n);
          n--;
          
          if(n != 0) {
            temp /= numsFactorial.get(n);
            n--;
          }
          
          temp += numsFactorial.get(n);
          n--;
          
          result += temp;
          
          if(n > 0) temp -= numsFactorial.get(n);
          
          temp = n * (-1);
          
          if (n == 1) result += temp;
          
          n--;
        }
      
        System.out.println(result);
    }
}
// RESOLUÇÃO DESAFIO FATORIAL DESAJEITADO END