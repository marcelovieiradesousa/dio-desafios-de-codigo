//  RESOLUÇÃO DESAFIO PNEU
import java.util.Scanner;

public class Pneu {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int pressaoDesejada = scan.nextInt();
    int pressaoLida = scan.nextInt();
    
    System.out.println(pressaoDesejada - pressaoLida);

    scan.close();

  }
}
// RESOLUÇÃO DESAFIO PNEU END 
