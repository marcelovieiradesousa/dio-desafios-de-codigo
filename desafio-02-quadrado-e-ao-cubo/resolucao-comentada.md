<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Iniciais JavaScript

## Desafio - Quadrado e ao Cubo
Desafio realizado no Bootcamp **Carrefour Web Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado (sintetizado)**
#### **Escrever um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.**.

📥 **Entrada:** Um número inteiro positivo N.

📤 **Saída:** Imprimir a saída conforme o exemplo fornecido.

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
5                           | 1 1 1
                            | 2 4 8
                            | 3 9 27
                            | 4 16 64
                            | 5 25 125

<br>

> **Instruções** <br>
Em JavaScript as funções de STDIN e STDOUT respectivamente são gets e console.log, a função gets é implementada internamente para auxiliar a entrada dos dados.

<br>

### ✅ **Resolução**

**📥 1. Entrada de dados**<br>
Primeiro vamos definir a entrada dos dados, para isso vamos declarar a variável [**let**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/let) e identificá-la. Em seguida, utilizaremos a função **gets** para a leitura da entrada (inputs) dos dados. E, sabendo que a entrada é **um número inteiro positivo N**, utilizaremos a função [**parseInt**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/parseInt) para retornar o valor como número inteiro.

```javascript
let entrada = parseInt(gets());
```

<br>

**📤 2. Saída de dados**<br>
 Em seguida, vamos definir a instrução [**for**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/for) para definirmos os valores da saída, e, sabendo que **1 < N < 1000**, vamos iniciar a variável **i** = 1. 
 <br>
 Para calcularmos o valor de **i** ao quadrado e ao cubo, utilizaremos a função [**Math.pow(base, expoente)**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Math/pow).
<br>
Por fim, vamos imprimir a saída (output) de dados através da função **console.log**, utilizando [**template strings**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Template_literals) e quebrando a linha com **\n**:

```javascript
for (let i = 1; i <= entrada; i++) { // i = i + 1. Simplificando, temos: i += 1. Simplificando ainda mais, temos: i++.
   let quadrado = Math.pow(i, 2);
   let cubo = Math.pow(i, 3);

   console.log(`${i} ${quadrado} ${cubo} \n `);
}
```

<br>

Com isso, temos a seguinte solução:

```javascript
let entrada = parseInt(gets());

for (let i = 1; i <= entrada; i++) {
   let quadrado = Math.pow(i, 2);
   let cubo = Math.pow(i, 3);

   console.log(`${i} ${quadrado} ${cubo} \n `);
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)
- [MDN Web Docs](https://developer.mozilla.org/pt-BR/)

<br>