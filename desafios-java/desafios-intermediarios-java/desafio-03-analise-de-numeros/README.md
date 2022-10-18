<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Intermediários Java

## Desafio - Análise de Números
Desafio realizado no Bootcamp **Carrefour Web Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos. Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.**

📥 **Entrada de dados:**  Você receberá 5 valores inteiros.

📤 **Saída:** Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.


 Exemplo de Entrada  | Exemplo de Saída 
---------------------|-----------
-5                   |  3 par(es)
0                    |  2 impar(es)
-3                   |  1 positivo(s)
-4                   |  3 negativo(s)
12                   |  

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>

Com isso, temos a seguinte solução:
```java
import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int qntPar = 0;
        int qntImpar = 0;
        int qntPositivo = 0;
        int qntNegativo = 0;
        
        while (leitor.hasNextInt()) {
            int entrada = leitor.nextInt();
            if (entrada % 2 == 0) qntPar++;
            if (entrada % 2 != 0) qntImpar++;
            if (entrada > 0) qntPositivo++;
            if (entrada < 0) qntNegativo++;
        }

        System.out.println( qntPar + " par(es)");
        System.out.println( qntImpar + " impar(es)");
        System.out.println( qntPositivo + " positivo(s)");
        System.out.println( qntNegativo + " negativo(s)");
    }	
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
