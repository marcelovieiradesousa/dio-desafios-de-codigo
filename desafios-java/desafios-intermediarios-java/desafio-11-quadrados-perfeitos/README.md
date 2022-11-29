<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Intermediários Java

## Desafio - Quadrados Perfeitos
Desafio realizado no Bootcamp **Potência Tech powered by iFood - Java Beginners** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.** 

📥 **Entrada de dados:** A entrada consiste em um número inteiro n, representando o valor total. 

📤 **Saída:** A saída consiste em retornar o menor número de números quadrados perfeitos. 

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
12                          | 3
13                          | 2
10                          | 2

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
```

Com isso, temos a seguinte solução:
```java
import java.util.*;

public class Desafio {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        List<Integer> quadradosPerfeitos = new ArrayList<>();
        int somaQuadrados = n;

        for(int i = 1; i <= n; i++){
          double raizQuadrada = Math.ceil(Math.sqrt(i));

          if(Math.pow(raizQuadrada, 2) == i){
            int quadradoPerfeito = i;
            quadradosPerfeitos.add(0, quadradoPerfeito);
          }
        }
        
        for(int j = 0; j < quadradosPerfeitos.size(); j++) {
          int entrada = n;
          int countQuadrados = 0;

          for(int k = j; k < quadradosPerfeitos.size(); k++) {
            while((entrada - quadradosPerfeitos.get(k)) >= 0) {
              entrada -= quadradosPerfeitos.get(k);
              countQuadrados++;
            }
          }
          
          if(countQuadrados < somaQuadrados) {
            somaQuadrados = countQuadrados;
          }
          
        }
              
        System.out.println(somaQuadrados);

    }
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
