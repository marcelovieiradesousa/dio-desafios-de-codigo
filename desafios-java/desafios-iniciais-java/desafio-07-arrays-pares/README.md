<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - Arrays Pares
Desafio realizado no Bootcamp **Québec Java Digital** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória. Dado uma array de valores {2, 3, 5, 7, 11, 13, 18, 34}, desenvolva um programa que retorne como resultado apenas os números pares dessa array.**

📥 **Entrada de dados:** A entrada consiste em um array de números inteiros positivos.

📤 **Saída:** A saída do desafio equivale aos números pares do Array, como mostra o exemplo a baixo:


Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
 2, 3, 5, 7, 11, 13, 18, 34 | 2
		       ͏ ͏ ͏           | 18 
 		    ͏ ͏ ͏              | 34

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
	System.out.println(array[i]);

```

Com isso, temos a seguinte solução:
```java
public class App {
    public static void main(String[] args){

     int array[] = {2, 3, 5, 7, 11, 13, 18, 34};

     for (int i = 0; i < array.length; i++){
          if (array[i] % 2 == 0){
                 System.out.println(array[i]);
                } 
            }      
			
    }
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
