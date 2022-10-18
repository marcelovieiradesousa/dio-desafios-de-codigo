<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Intermediários Java

## Desafio - Dragão Berrador World
Desafio realizado no Bootcamp **Santander Fullstack Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**

  <img height="100" src="https://www.beecrowd.com.br/gallery/images/problems/UOJ_2686.png?origem=1">

#### **Todos os habitantes do Mundo Mágico estão super animados com a abertura do Dragão Berrador World, o mais novo parque de diversões do universo bruxo.**
**Infelizmente foram impostas algumas restrições no momento da homologação do brinquedo pelo Ministério Bruxo. Por questões de segurança, há uma altura mínima e uma altura máxima que as pessoam devem ter para poder passear na montanha-russa.**
**Para o dia da inauguração do parque, todos os convidados realizaram um pré-cadastro no qual indicaram sua altura. Para reduzir filas e otimizar a operação do parque no primeiro dia, você foi contratado pela gerência do Dragão Berrador World para fazer um programa que, dado o número de visitantes, altura mínima, altura máxima e as alturas de todos os visitantes, calcule quantas pessoas poderão andar na montanha-russa.**

📥 **Entrada de dados:** A entrada contém vários casos de teste. A primeira linha de cada caso consiste em três inteiros N (1 ≤ N ≤ 100), Amin e Amax (50 ≤ Amin ≤ Amax ≤ 250), o número de visitantes, a altura mínima e máxima em centímetros para andar na montanha-russa, respectivamente.
As N linhas seguintes contém, cada uma, um número inteiro representando a altura do visitantes, em centímetros.

📤 **Saída:** Para cada caso de teste, imprima uma única linha com o número visitantes que podem passear na montanha-russa.

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
8 160 182                   | 5
160               	        | 
182            		          | 
183            		          | 
159            		          | 
250            		          | 
170            		          | 
172            		          | 
173            		          | 

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
5 155 176                   | 2
149              	          | 
154            		          | 
172            		          | 
182            		          | 
167            		          | 

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java

```

Com isso, temos a seguinte solução:
```java
import java.io.IOException;
import java.util.Scanner;
public class DIO {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int numGuests = leitor.nextInt();
			int minHeight = leitor.nextInt();
			int maxHeight = leitor.nextInt();
			int enteredGuests = 0;

			for (int i = 0; i < numGuests; i++) {
				int guestHeight = leitor.nextInt();
				if (guestHeight >= minHeight && guestHeight <= maxHeight) enteredGuests++;
			}
			System.out.println(enteredGuests);
		}
	}
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
