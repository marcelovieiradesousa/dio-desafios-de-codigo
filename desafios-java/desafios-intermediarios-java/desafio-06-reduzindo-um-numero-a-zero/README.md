<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Intermediários Java

## Desafio - Reduzindo um Número a Zero
Desafio realizado no Bootcamp **Québec Java Digital** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**

  <img height="100" src="https://www.beecrowd.com.br/gallery/images/problems/UOJ_2686.png?origem=1">

#### **Dado um inteiro x, retorne o número de etapas para reduzi-lo a zero. Em uma etapa, se o número atual for par, você deve dividi-lo por 2, caso contrário, você deve subtrair 1 dele.**

📥 **Entrada de dados:** A entrada consiste em um número inteiro x. Você deverá implementar a solução de acordo com a descrição do desafio.

📤 **Saída:** O resultado impresso, será o valor exato das etapas possíveis para reduzir o valor de x a zero, como nos exemplos a baixo:

**Exemplo 1:**

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
14			                    | 6

**Explicação:**

Etapa 1) 14 é par; divida por 2 e obtenha 7. 

Etapa 2) 7 é ímpar; subtraia 1 e obtenha 6.

Etapa 3) 6 é par; divida por 2 e obtenha 3. 

Etapa 4) 3 é ímpar; subtraia 1 e obtenha 2. 

Etapa 5) 2 é par; divida por 2 e obtenha 1. 

Etapa 6) 1 é ímpar; subtraia 1 e obtenha 0.

**Exemplo 2:**
Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
8			                      | 4

**Explicação:** 

Etapa 1) 8 é par; divida por 2 e obtenha 4. 

Etapa 2) 4 é par; divida por 2 e obtenha 2. 

Etapa 3) 2 é par; divida por 2 e obtenha 1. 

Etapa 4) 1 é ímpar; subtraia 1 e obtenha 0.

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
    System.out.println(step);
```

Com isso, temos a seguinte solução:
```java
import java.util.*;
 
public class Program
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        while (num > 0) {
          if (num % 2 == 0) {
            num /= 2;
            step++;
          } else {
            num -= 1;
            step++;
          }
        }
        
        System.out.println(step);
    }
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
