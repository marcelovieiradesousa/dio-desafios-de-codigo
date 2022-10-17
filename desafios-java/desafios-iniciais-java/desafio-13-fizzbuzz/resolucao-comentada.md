<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - FizzBuzz
Desafio realizado no Bootcamp **Potência Tech powered by iFood - Java Beginners** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz".**

📥 **Entrada de dados:** Você receberá um número onde: 
Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ; 
Se o número for apenas múltiplo de 3 -> "Fizz" ; 
Se o número for apenas múltiplo de 5 -> "Buzz"; 
Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido; 

📤 **Saída:** Retorne a palavra correta de acordo com o seu múltiplo. Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme exemplo abaixo:

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
3                           | Fizz
5                           | Buzz
15                          | FizzBuzz 
4                           | 4

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
      System.out.println();
```

Com isso, temos a seguinte solução:
```java
import java.util.*;

public class Desafio {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
          System.out.println("FizzBuzz");
          
        } else if(num % 3 == 0 || num % 5 == 0) {
          if(num % 3 == 0){
            System.out.println("Fizz");
          } else {
            System.out.println("Buzz");
          } 
          
        } else {
          System.out.println(num);
        }
    }
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
