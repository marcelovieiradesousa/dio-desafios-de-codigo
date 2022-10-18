<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - Idades
Desafio realizado no Bootcamp **Carrefour Web Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.**

📥 **Entrada de dados:** um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

📤 **Saída:** um valor correspondente à média de idade dos indivíduos.
A média deve ser impressa com dois dígitos após o ponto decimal.

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
		System.out.println(String.format("%.2f", media));
```

Com isso, temos a seguinte solução:
```java
import java.io.IOException;
import java.util.Scanner;

public class  Desafio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int cont = 0;
        int n = 0;
        double soma = 0;
        
        do {
            n = leitor.nextInt();
            if (n > 0) {
              cont++;
              soma += n;
            }
        } while (n > 0);
        
        
        double media = soma / cont;
        
        System.out.println(String.format("%.2f", media));
    }
	
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
