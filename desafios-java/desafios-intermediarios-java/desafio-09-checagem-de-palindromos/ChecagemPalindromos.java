//  RESOLUÇÃO DESAFIO CHECAGEM DE PALÍNDROMOS
import java.util.Scanner;

public class ChecagemPalindromos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String palavra = leitor.nextLine();
        
        String palavraInvertida = new StringBuffer(palavra).reverse().toString();

        System.out.println(palavraInvertida.equals(palavra) ? "TRUE" : "FALSE");

        leitor.close();
    }
}
// RESOLUÇÃO DESAFIO CHECAGEM DE PALÍNDROMOS END