<div align="center">
  <img alt="Java" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/java.svg">
</div>

<br>

# 💻 Desafios Intermediários Java

## Desafio - Robô
Desafio realizado no Bootcamp **Québec Java Digital** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**

  <img height="100" src="https://www.beecrowd.com.br/gallery/images/problems/UOJ_2686.png?origem=1">

#### **Em um jogo 2D existe um robô de limpeza que começa na posição (0,0). Ele recebe alguns comandos através de uma sequência de movimentos. Os movimentos válidos são: 'W' (movimento para cima), "S"(movimento para baixo), "D"(movimento para direita) e "A"(movimento para esquerda). Você deverá verificar se após completar seus movimentos o robô se encontra na posição (0,0). Retorne true se o robô retornar à origem ou false caso contrário. Assuma que a magnitude do movimento do robô é a mesma para cada movimento.**

📥 **Entrada de dados:** A entrada consiste em duas Strings que representam a sequência de movimentos do Robô. 

📤 **Saída:** Cada caso de teste retorna um tipo booleano, true ou false, de acordo com a entrada e condições do desafio proposto.

**Exemplo 1:**

Exemplo de Entrada          |
--------------------------- | 
Movimento = **"WS"**		    | 

**Explicação:** O robô sobe uma vez e depois desce uma vez. Todos os movimentos têm a mesma magnitude, então acabou na origem onde começou. Portanto, retornamos true.

**Exemplo 2:**
Exemplo de Entrada          |
--------------------------- | 
Movimento = **"AA"**			  | 

**Explicação:** O robô se move para a esquerda duas vezes. Termina dois "movimentos" à esquerda da origem. Retornamos false porque não está na origem no final de seus movimentos.

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
import java.util.*;
 
public class Program
{
public static void main(String[] args)
 
{
        String movimentos = new Scanner(System.in).nextLine();
 
        var x = 0;
        var y = 0;

        for (int i = 0; i < movimentos.length(); i++)
        {
            char ch = movimentos.charAt(i);
            if (ch == 'W')
            {
                    x++;
            }
                if (ch == 'S')
                {
                    x--;
                }
                if (ch == 'D')
                {
                    y++;
                }
                if (ch == 'A')
                {
                    y--;
                }
        }
 
            if (x == 0 && y == 0)
            {
                System.out.print("true");
            }
            else
            {
                System.out.print("false");
            }
  }
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
