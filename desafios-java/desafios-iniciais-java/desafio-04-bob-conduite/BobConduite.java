//  RESOLUÇÃO DESAFIO BOB CONDUITE
import java.io.IOException;
import java.util.Scanner;

public class BobConduite {
  
  public static void main(String[] args) throws IOException {

    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    
    for (int i = 0; i < T; i++) {
      int R1 = scan.nextInt();
      int R2 = scan.nextInt();
      System.out.println(R1 + R2);
    }

    scan.close();

  }
}
// RESOLUÇÃO DESAFIO BOB CONDUITE END 
