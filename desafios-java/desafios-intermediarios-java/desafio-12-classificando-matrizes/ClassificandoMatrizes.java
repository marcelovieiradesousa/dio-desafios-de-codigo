//  RESOLUÇÃO DESAFIO QUADRADOS PERFEITOS
import java.util.*;
import java.util.Scanner;

public class ClassificandoMatrizes {
  public static void main(String args[]) {
          
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
  	int [] numeros = new int[N];
  	for(int i = 0; i < N; i++) numeros[i] = sc.nextInt();
  	
  	List<Integer> numOrdenados = new ArrayList<>(N);
  	
  	for(int numero : numeros) if(numero % 2 == 0) numOrdenados.add(numero);
  	for(int numero : numeros) if(numero % 2 != 0 && numero != 5) numOrdenados.add(numero);
  	for(int numero : numeros) if(numero == 5) numOrdenados.add(3,numero);
  	for(int num : numOrdenados) System.out.println(num);
  }
}
// RESOLUÇÃO DESAFIO QUADRADOS PERFEITOS END