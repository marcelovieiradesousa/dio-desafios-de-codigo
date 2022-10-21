//  RESOLUÇÃO DESAFIO VALIDAÇÃO DE PARÊNTESES
import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        String[] caracteres = {"(", ")", "{", "}", "[", "]" };
        String[] caracterEntrada = s.split("");
        boolean validacao = false;
        
        for(int i = 0; i < caracteres.length; i++) {
          if(caracterEntrada[0].equals(caracteres[i]) && caracterEntrada[1].equals(caracteres[i + 1])){
            validacao = true;
          }
        }
        
        return validacao;
    }

}
// RESOLUÇÃO DESAFIO VALIDAÇÃO DE PARÊNTESES END