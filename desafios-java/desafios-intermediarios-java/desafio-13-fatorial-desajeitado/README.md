<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Intermediários Java

## Desafio - Fatorial Desajeitado
Desafio realizado no Bootcamp **Potência Tech powered by iFood - Java Beginners** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **O fatorial de um número inteiro positivo N é o produto de todos os inteiros positivos menores ou iguais a n. Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, trocando as operações de multiplicação por uma rotação fixa de operações cuja ordem é: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'. Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1. Lembre-se que no fatorial desajeitado as operações ainda são aplicadas usando a ordem usual de operações aritméticas. Além disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11. Dado um inteiro N, retorne o fatorial desajeitado de n.** 

📥 **Entrada de dados:** A entrada consiste em um valor inteiro positivo N.

📤 **Saída:** A saída consiste em retornar o valor do seu fatorial desajeitado de N, conforme exemplo abaixo.

**Exemplo 1:**
Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
4                           | 7

**Explicação:** 7 = 4 * 3 / 2 + 1 

**Exemplo 2:**
Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
10                           | 12

Explicação: 12 = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
  System.out.println(result);
```

Com isso, temos a seguinte solução:
```java
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
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
