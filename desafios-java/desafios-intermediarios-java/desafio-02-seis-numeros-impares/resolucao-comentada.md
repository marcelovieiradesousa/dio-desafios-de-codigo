<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Intermediários Java

## Desafio - Seis Números Ímpares
Desafio realizado no Bootcamp **Carrefour Web Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.**

📥 **Entrada de dados:**  A entrada será um valor inteiro positivo.

📤 **Saída:** A saída será uma sequência de seis números ímpares.


 Exemplo de Entrada  | Exemplo de Saída 
---------------------|-----------
8                    |  9 
ㅤ                   |  11 
ㅤ                   |  13
ㅤ                   |  15
ㅤ                   |  17
ㅤ                   |  19

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>

Com isso, temos a seguinte solução:
```java
import java.io.IOException;
import java.util.Scanner;

public class Desafio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;

        while (cont < 6) {
        	if (x % 2 != 0) {
        		System.out.println(x);
        		cont++;
        	}
        	x++;
        }
    }
	
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
