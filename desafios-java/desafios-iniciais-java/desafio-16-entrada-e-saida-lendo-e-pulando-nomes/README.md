<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Iniciais Java

## Desafio - Entrada e Saída Lendo e Pulando Nomes
Desafio realizado na Formação **Java Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Faça um programa com as características abaixo:**

1. Leia 10 nomes, sem espaço em branco;
2. Imprima o terceiro nome da lista;
3. Imprima o sétimo nome da lista;
4. Imprima o nono nome da lista.

📥 **Entrada de dados:** A entrada consiste vários arquivos de teste, cada um com dez linhas e em cada linha tem um nome de no até 30 caracteres e sem espaço em branco. Conforme mostrado no exemplo de entrada a seguir.

📤 **Saída:** Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, gere três linhas conforme os procedimentos 2, 3 e 4. Use o exemplo abaixo para clarear o que está sendo pedido.

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
USP                         | UFCG
UFPE                        | ITA
UFCG                        | URI
UFRN                        | 
UFRJ                        | 
IME                         | 
ITA                         | 
UNIOESTE                    | 
URI                         | 
UFG                         | 

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **System.out.println()**:
```java
	System.out.println(nomes[2]);
	System.out.println(nomes[6]);
	System.out.println(nomes[8]);
```

Com isso, temos a seguinte solução:
```java
import java.util.Scanner;

public class EntradaSaidaNomes {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++)
			nomes[i] = sc.nextLine();
  
		System.out.println(nomes[2]);
		System.out.println(nomes[6]);
		System.out.println(nomes[8]);

		sc.close();
		
	}
	
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>