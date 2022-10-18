<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - Busca Sequencial
Desafio realizado no Bootcamp **Potência Tech powered by iFood - Java Beginners** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Uma busca sequencial se caracteriza por percorrermos todos os  elementos de uma estrutura em busca do elemento “X” desejado. Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor fazendo as comparações de A[N] = X. Caso a condição seja verdadeira, “X” existe na estrutura e a busca será concluída com sucesso.** 

Considere um array de 10 elementos do tipo inteiro: 

Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}. 

● Carregue esses elementos em um array.  

● Implementação da busca sequencial: 

● Crie um método  que realiza uma busca sequencial.  

● Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no array. Caso contrario retorne um texto dizendo que o número não foi encontrado, conforme exemplos abaixo.

📥 **Entrada de dados:** A entrada consiste em um valor de busca e/ou array. 

📤 **Saída:** A saída será a a posição do elemento no array, caso o valor não se encontre na Array, retorne a frase " Numero __ nao encontrado!", como no exemplo abaixo:

**Exemplo 1**
Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
81                          | Achei 81 na posicao 5 
10                          | Achei 10 na posicao 8 
-16                         | Achei –16 na posicao 2 
4                           | Numero 4 nao encontrado! 

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
for (i = 0; i < elementos.length; i++) {
  if(elementos[i] == number) {
    System.out.println("Achei " + number + " na posicao " + i);
    break;
  }
}

if (i == elementos.length){
  System.out.println("Numero " + number + " nao encontrado!");
}
```

Com isso, temos a seguinte solução:
```java
import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        
        int number = leitor.nextInt();

        int i;
        
        for (i = 0; i < elementos.length; i++) {
          if(elementos[i] == number) {
            System.out.println("Achei " + number + " na posicao " + i);
            break;
          }
        }
        
        if (i == elementos.length){
          System.out.println("Numero " + number + " nao encontrado!");
        }
        
        leitor.close();
    }
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
