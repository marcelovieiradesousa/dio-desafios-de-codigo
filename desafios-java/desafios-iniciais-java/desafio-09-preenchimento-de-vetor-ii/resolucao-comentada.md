<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - Preenchimento de Vetor II
Desafio realizado no Bootcamp **Québec Java Digital** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Neste problema, deve-se ler:**
**Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.**

📥 **Entrada de dados:** A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

📤 **Saída:** Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

**Exemplo 1:**

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
3                           | N[0] = 0
                            | N[1] = 1
                            | N[2] = 2
                            | N[3] = 0
                            | N[4] = 1
                            | N[5] = 2
                            | N[6] = 0
                            | N[7] = 1
                            | N[8] = 2
                            | ...

Agradecimentos a Cassio F.

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
    System.out.println("N[" + n[i] + "] = "+ x);   
```

Com isso, temos a seguinte solução:
```java
import java.util.Scanner; 

public class App {
    
public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 
    int t = leitor.nextInt(); 
   
        int[] n = new int[1000];
        int i = 0;
        
        while(i < n.length){
          for(int x = 0; x < t; x++){
            if(i < n.length){
                n[i] = i;
                System.out.println("N[" + n[i] + "] = "+ x);
                i++;
            }
        }
    }
  }
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
