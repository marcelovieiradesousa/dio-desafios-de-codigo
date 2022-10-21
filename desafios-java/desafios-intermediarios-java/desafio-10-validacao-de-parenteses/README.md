<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Intermediários Java

## Desafio - Validação Parênteses
Desafio realizado no Bootcamp **Potência Tech powered by iFood - Java Beginners** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida. ** 

📥 **Entrada de dados:** Uma string é considerada válida se:

Caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida.  

📤 **Saída:** A saída corresponde a um valor Booleano como no exemplo abaixo:


Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
[]                          | true
()                          | true
[)                          | false

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
  System.out.println(caracter);
```

Com isso, temos a seguinte solução:
```java
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
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
