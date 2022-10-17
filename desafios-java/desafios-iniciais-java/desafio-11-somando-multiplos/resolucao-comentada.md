<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - Somando Múltiplos
Desafio realizado no Bootcamp **Potência Tech powered by iFood - Java Beginners** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.**

📥 **Entrada de dados:** A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 

📤 **Saída:** A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.

**Exemplo 1**
Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
5                           | 50
20                          | 

**Exemplo 2**
Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
3                           | 63
18                          | 

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
      System.out.println(somaMultiplos);
```

Com isso, temos a seguinte solução:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, N, somaMultiplos;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        somaMultiplos = 0;

        for (int i = 0; i <= N; i++) {
          if (i % A == 0){
            int multiplo = i;
            somaMultiplos+= multiplo;
          }
        }
        
        System.out.println(somaMultiplos);
    }
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
