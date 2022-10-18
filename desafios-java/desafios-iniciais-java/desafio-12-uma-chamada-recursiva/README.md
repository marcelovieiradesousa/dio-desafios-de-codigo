<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - Uma Chamada Recursiva
Desafio realizado no Bootcamp **Potência Tech powered by iFood - Java Beginners** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.**

📥 **Entrada de dados:** A Entrada será composta por um número inteiro, N. 

📤 **Saída:** Será  impresso o somatório de N até 0, como no exemplo a baixo:

**Exemplo 1**
Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
10                          | 55
4                           | 10
15                          | 120

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
        System.out.println(somatorio(N));
```

Com isso, temos a seguinte solução:
```java
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int N = numero.nextInt();
        
        System.out.println(somatorio(N));
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
