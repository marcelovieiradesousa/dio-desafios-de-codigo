<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - Mjölnir
Desafio realizado na Formação **Java Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Odin criou para Thor a mais fiel e poderosa arma possível, o martelo Mjölnir. Feito de um minério místico especial chamado Uru e forjado no coração de uma estrela pelos Deuses ferreiros de Asgard, Brokk e Eitri, os lendários ferreiros.**

Um dia, Thor desafiou seus amigos para ver quem conseguia levantar o Mjölnir.

Escreva um programa que, dado um nome, e a força, em Newtons, aplicado ao tentar levantar o Mjölnir, informar se a pessoa conseguiu ou não levantá-lo.

📥 **Entrada de dados:** Um número inteiro C será informado, que será a quantidade de casos de teste. Cada caso de teste inicia com uma palavra, que é o primeiro nome de quem está tentando levantar o Mjölnir, e um inteiro N (1 ≤ N ≤ 25000), indicando a força aplicada para cima, em Newtons, ao puxar o martelo, de modo a tentar levantá-lo.

📤 **Saída:** Para cada caso de teste imprima um caractere ‘Y’, caso a pessoa tenha conseguido levantar , ou ‘N’, caso não tenha conseguido.

V Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2015

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
	if (nome.equals("Thor")) System.out.println("Y");
	else System.out.println("N");
```

Com isso, temos a seguinte solução:
```java
import java.util.Scanner;

public class Mjolnir {
  
    public static void main(String[] args){
      
  		Scanner leitor = new Scanner(System.in);
  		int C = leitor.nextInt();
  		String nome;
  		int N;
  
  		for (int i = 0; i < C; i++) {
  			nome = leitor.next();
  			N = leitor.nextInt();
  			
  			if (nome.equals("Thor")) System.out.println("Y");
  			else System.out.println("N");
  		}
		
    }
	
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>