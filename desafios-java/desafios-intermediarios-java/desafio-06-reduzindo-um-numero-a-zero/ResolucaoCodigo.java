//  RESOLUÇÃO REDUZINDO UM NÚMERO A ZERO
import java.util.*;
 
public class Program
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        while (num > 0) {
          if (num % 2 == 0) {
            num /= 2;
            step++;
          } else {
            num -= 1;
            step++;
          }
        }
        
        System.out.println(step);
    }
}
// RESOLUÇÃO REDUZINDO UM NÚMERO A ZERO END 
