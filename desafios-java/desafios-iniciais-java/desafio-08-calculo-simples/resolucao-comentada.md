<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - Cálculo Simples
Desafio realizado no Bootcamp **Québec Java Digital** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Neste problema, deve-se ler:**
**O código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1. O código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.**

📥 **Entrada de dados:** O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

📤 **Saída:** A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

**Exemplo 1:**

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
12 1 5.30                   | VALOR A PAGAR: R$
16 2 5.10		       ͏ ͏ ͏       | 15.50


<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
     System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));   
```

Com isso, temos a seguinte solução:
```java
import java.io.IOException;
import java.util.Scanner;

public class Problem {
	
  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
		
      int cod1 = leitor.nextInt();
      int n1 = leitor.nextInt();
      double valor1 = leitor.nextDouble();
      
      int cod2 = leitor.nextInt();
      int n2 = leitor.nextInt();
      double valor2 = leitor.nextDouble();

      double total = (valor1 * n1) + (valor2 * n2);
     System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));   
    }
	
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
