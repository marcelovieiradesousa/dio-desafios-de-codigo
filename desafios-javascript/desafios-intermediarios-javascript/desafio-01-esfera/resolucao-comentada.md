<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Intermediários JavaScript

## Desafio - Esfera
Desafio realizado no Bootcamp **Carrefour Web Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.**

**Dica:** Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da divisão entre dois inteiros é outro inteiro.


📥 **Entrada de dados:** um valor de ponto flutuante (dupla precisão), correspondente ao **raio da esfera**.

📤 **Saída:** uma mensagem **"VOLUME"** conforme o exemplo fornecido abaixo, com um **espaço antes e um espaço depois da igualdade**. O valor deverá ser apresentado com **3 casas após o ponto**.


Exemplos de Entrada         | Exemplos de Saída
--------------------------- | ---------------------------
3                           | VOLUME = 113.097
15 ͏ ͏ ͏ ͏                      | VOLUME = 14137.155
1523 ͏                       | VOLUME = 14797486501.627

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>
Primeiro vamos definir a entrada dos dados, para isso vamos declarar a variável [**let**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/let) e identificá-la. Em seguida, utilizaremos a função **gets** para a leitura da entrada (inputs) dos dados. E, sabendo que a entrada é **número em “ponto flutuante**, utilizaremos a função [**parseFloat**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/parseFloat) para retornar o valor como número de ponto flutuante.

```javascript
let R = parseFloat(gets());
```

Sabendo que a fórmula para o cálculo do volume de uma esfera é **V = 4/3 πr³**, vamos definir a constante **PI = 3.14159** e a variável **V** referente ao volume da esfera. Para calcular a potência, vamos utilizar a função [**Math.pow(base, expoente)**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Math/pow). E para garantir que o resultado sejam 3 casas após o ponto, vamos utilizar o método [**toFixed()**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Number/toFixed).

```javascript
const PI = 3.14159;

let V = (4/3.0 * PI * Math. pow(R,3)).toFixed(3);
```

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados através da função **console.log**, utilizando [**template strings**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Template_literals):

```javascript
console.log(`VOLUME =  ${V}`);
```

Com isso, temos a seguinte solução:

```javascript
let R = parseFloat(gets());

const PI = 3.14159;

let V = (4/3.0 * PI * Math. pow(R,3)).toFixed(3);

console.log(`VOLUME =  ${V}`);
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)
- [MDN Web Docs](https://developer.mozilla.org/pt-BR/)

<br>