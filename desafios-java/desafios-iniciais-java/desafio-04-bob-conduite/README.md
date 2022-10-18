<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - Bob Conduite
Desafio realizado no Bootcamp **Santander Fullstack Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2. Você precisa comprar um conduite circular (veja a imagem abaixo que ilustra um conduite) de maneira a passar os dois cabos por dentro dele:**

<img alt="Java" height="100" src="https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1589.jpg">

**Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos, qual o raio do menor círculo que possa englobar ambos os dois?**

📥 **Entrada de dados:** Na primeira linha teremos um inteiro T (T ≤ 10000), indicando o número de casos de teste.
Na única linha de cada caso teremos dois números inteiros R1 e R2, indicando os respectivos raios. Os inteiros serão positivos e todas as contas caberão em um inteiro normal de 32 bits.

📤 **Saída:** Em cada caso, imprima o menor raio possível em uma única linha.

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
3                           | 2
1 1      ͏ ͏ ͏                 | 10
2 8     ͏ ͏ ͏ ͏                 | 10
8 2     ͏ ͏ ͏ ͏                 | 

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
	System.out.println(R1 + R2);
```

Com isso, temos a seguinte solução:
```java
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    
    for (int i = 0; i < T; i++) {
      int R1 = scan.nextInt();
      int R2 = scan.nextInt();
      System.out.println(R1 + R2);
    }
  }
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
