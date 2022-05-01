<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - Multiplicação Simples
Desafio realizado no Bootcamp **Carrefour Web Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).**

📥 **Entrada de dados:** 2 valores inteiros.

📤 **Saída:** Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
		System.out.println("PROD = " +  PROD);
```

Com isso, temos a seguinte solução:
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD = A * B; //implemente o código que representa a multiplicação.
		
		System.out.println("PROD = " +  PROD);
		
		sc.close();
		
	}
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
