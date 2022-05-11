<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Intermediários Java

## Desafio - DDD
Desafio realizado no Bootcamp **Carrefour Web Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:**

 DDD     | Localidade 
---------|-----------
 61      |  Brasilia 
 71      |  Salvador 
 11      |  Sao Paulo 
 21      |  Rio de Janeiro 
 32      |  Juiz de Fora 
 19      |  Campinas 
 27      |  Vitoria 
 31      |  Belo Horizonte 

Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

📥 **Entrada de dados:**  um único valor inteiro.

📤 **Saída:** Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.

 Exemplo de Entrada  | Exemplo de Saída 
---------|-----------
 11      |  Sao Paulo 

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>

Com isso, temos a seguinte solução:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner cs = new Scanner(System.in);
      int a = sc.nextInt();
      if(a == 61){
          System.out.printf("Brasilia\n");
      }
      else if(a == 71){
          System.out.printf("Salvador\n");
      }
      else if(a == 11){
          System.out.printf("Sao Paulo\n");
      }
       else if(a == 21){
          System.out.printf("Rio de Janeiro\n");
      }
       else if(a == 32){
          System.out.printf("Juiz de Fora\n");
      }
       else if(a == 19){
          System.out.printf("Campinas\n");
      }
       else if(a == 27){
          System.out.printf("Vitoria\n");
      }
       else if(a == 31){
          System.out.printf("Belo Horizonte\n");
      }
       else{
           System.out.printf("DDD nao cadastrado\n");
       }
    }
    
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
