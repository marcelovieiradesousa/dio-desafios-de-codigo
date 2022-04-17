<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Iniciais JavaScript

## Desafio - Teorema da Divisão Euclidiana (Algoritmo da Divisão)
Desafio realizado no Bootcamp **Carrefour Web Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado (sintetizado)**
#### **Desenvolver um programa que calcule o quociente e o resto da divisão de dois números inteiros**.

**Atenção:** o quociente e resto da divisão de um inteiro **a** por um inteiro não-nulo **b** são respectivamente os únicos inteiros **q** e **r**, tais que:

0 ≤ r < |b|
<br>
Se r < 0: r = r - |b|
<br>
a = b * q + r 
<br>
q = (a - r) / b

📥 **Entrada de dados:** 2 números inteiros **a** e **b** (-1.000 ≤ **a**, **b** < 1.000).

📤 **Saída:** Imprimir o quociente **q** seguido pelo resto **r** da divisão de **a** por **b**.

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>
Primeiro vamos definir a entrada dos dados, para isso vamos declarar a variável [**let**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/let) e identificá-la. Em seguida, utilizaremos a função **gets** para a leitura das entradas (inputs) dos dados, e o método [**split**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/String/split) para retornar o array com o separador que definirmos através dele.

```javascript
let entrada = gets().split(' ');
```

Agora, vamos declarar as váriáveis referentes aos valores de **a, b, q e r**. Para retornar os valores como números inteiros, utilizaremos a função [**parseInt**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/parseInt), e indicaremos os índices referentes a **a** e **b** para identificar os valores de entrada correspondentes.

```javascript
let a = parseInt(entrada[0]);
let b = parseInt(entrada[1]);
```

Sabendo que **q** é a parte inteira de **a / b**, temos:

```javascript
let q = parseInt(a / b);
```

E, sendo **r** o resto da divisão entre **a** e **b**, utilizaremos o operador de atribuição de resto **%**:

```javascript
let r = a % b;

// Sabendo que a = b * q + r, poderíamos utilizar também:
let r = a - b * q
```

Temos ainda que: **Se `r < 0 : r = r - |b|`**. Dessa forma, utilizaremos o método [Math.abs(b)](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Math) para retornar o módulo de **b**:

```javascript
r = r + Math.abs(b);

// Podemos ainda abreviar para:
r += Math.abs(b);
```
A partir disso, estabelecemos a condição:

```javascript
if (r < 0) {
  r += Math.abs(b);
  
  q = (a - r) / b;
}
```
<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados através da função **console.log**, na ordem definida pelo enunciado (q seguido de r), sendo os valores separados pela string definida anteriormente pelo método split:
```javascript
console.log(q + ' ' + r);
```

Com isso, temos a seguinte solução:
```javascript
let entrada = gets().split(' ');

let a = parseInt(entrada[0]);
let b = parseInt(entrada[1]);
let q = parseInt(a / b);
let r = a % b;

if (r < 0) {
  r += Math.abs(b);
  
  q = (a - r) / b;
}

console.log(q + ' ' + r);
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)
- [MDN Web Docs](https://developer.mozilla.org/pt-BR/)

<br>