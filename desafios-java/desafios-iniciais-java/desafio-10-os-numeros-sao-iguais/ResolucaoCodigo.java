//  RESOLUÇÃO DESAFIO OS NÚMEROS SÃO IGUAIS?
import java.util.*;

public class Desafio {

    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);
      
      int A = entrada.nextInt();
      int B = entrada.nextInt();
      
      String compararNumeros = (A == B) ? "Sao iguais!" : "Nao sao iguais!";
      
      System.out.println(compararNumeros);
    }
}
// RESOLUÇÃO DESAFIO OS NÚMEROS SÃO IGUAIS? END