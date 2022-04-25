<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Intermediários JavaScript

## Desafio - Ultrapassando V
Desafio realizado no Bootcamp **Carrefour Web Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Como um bom desenvolvedor, você precisa fazer um programa que leia dois inteiros: R e V (devem ser lidos tantos valores para V quantos necessários, até que seja digitado um valor maior do que R para ele). Conte quantos números inteiros devem ser somados em sequência (considerando o R nesta soma) para que a soma ultrapasse a V o mínimo possível. Escreva o valor final da contagem.**
> A entrada pode conter, por exemplo, os valores 21 21 15 30. Neste caso, é então assumido o valor 21 para R enquanto os valores 21 e 15 devem ser desconsiderados pois são menores ou iguais a R. Como o valor 30 está dentro da especificação (maior do que R) ele será válido e então deve-se processar os cálculos para apresentar na saída o valor 2, pois é a quantidade de valores somados para se produzir um valor maior do que 30 (21 + 22).

📥 **Entrada de dados:** Somente valores **inteiros**, **um por linha**, podendo ser positivos ou negativos. O **primeiro** valor da entrada **será o valor de R**. A próxima linha da entrada irá conter V. Se V não atender a especificação do problema, ele deverá ser lido novamente, tantas vezes quantas forem necessárias.

📤 **Saída:** Imprima uma linha com um número inteiro que representa a quantidade de números inteiros que devem ser somadas, de acordo com a especificação acima.


Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
3                           | 5
1  ͏ ͏ ͏ ͏                      | 
20   ͏                       | 

<br>

### ✅ **Resolução Comentada**

**📝 Entendendo o enunciado**
- Basicamente, a princípio temos 2 variáveis, sendo elas **R** e **V**.
- A entrada é composta por valores inteiros, um por linha, podendo ser positivos ou negativos. 
- O primeiro valor da entrada será atribuído a **R**, enquanto o segundo só será atribuído a **V** caso esse valor seja **maior do que R**.
- Caso o valor seja **menor ou igual a R**, **não vamos atribuí-lo a V**, e sim, ler mais valores até que seja digitado um maior do que R.
- Por fim, vamos gerar na saída a contagem dos números de entrada (incluindo o primeiro que atribuímos a R) necessários para que o valor atribuído a R seja maior do que o de V. Por exemplo, 15 8 5 26, R= 15, V= 26, contNumUltV = 3 **(15 + 8 + 5 = 28 > 26)**

<br>

**📥 1. Entrada de dados**<br>
Primeiro vamos definir a entrada dos dados, que será **valores inteiros**, para isso vamos declarar a variável [**let**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/let) e identificá-la. Em seguida, utilizaremos a função **gets** para a leitura da entrada (inputs) dos dados. E, sabendo que a entrada é um **valor inteiro**, utilizaremos a função [**parseInt**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/parseInt) para retornar o valor como número inteiro.
 Vamos identificar como **R**, pois o primeiro valor de entrada será atribuído a ele.

```javascript
let R = parseInt(gets());
```

 Então, sabendo que o primeiro valor da entrada será atribuído a **R**, e o segundo só será atribuído a **V** caso esse valor seja **maior do que R**, vamos criar um laço de repetição utilizando a declaração [while](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/while) para estabelecer a ***entrada de dados de V** com essa condição.

```javascript
let V = 0

while(V <= R){ // enquanto V <= R for true, será executado:
  V = parseInt(gets())
}
```

Agora, vamos fazer o somatório para atribuír na saída de dados. Primeiro vamos declarar duas variáveis, uma referente a **contagem dos números** e a outra **contagem de números para ultrapassar V**. Em seguida, vamos criar um laço de repetição utilizando a declaração [while](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/while) para estabelecer a contagem dos números enquanto esse valor for menor ou igual a V.

```javascript
let contNum = 0;
let contNumUltV = 0;

while(contNum <= V){ // enquanto contNum <= V for true, será executado:
  contNum += R;
  R++;
  contNumUlt++
}
```

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados através da função **console.log**:

```javascript
console.log(contNumUltV);
```

Com isso, temos a seguinte solução:

```javascript
let R = parseInt(gets());
let V = 0

while(V <= R){ // enquanto V <= R for true, será executado:
  V = parseInt(gets())
}

let contNum = 0;
let contNumUltV = 0;

while(contNum <= V){ // enquanto contNum <= V for true, será executado:
  contNum += R;
  R++;
  contNumUltV++;
}

 console.log(contNumUltV); 
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)
- [MDN Web Docs](https://developer.mozilla.org/pt-BR/)

<br>
