<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Iniciais JavaScript

## Desafio - Quadrado de Pares
Desafio realizado no Bootcamp **Santander Fullstack Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.**

📥 **Entrada:** A entrada contém um valor inteiro N (5 < N < 2000).


📤 **Saída:** Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
6                           | 2^2 = 4
 ͏ ͏ ͏ ͏                        | 4^2 = 16
 ͏ ͏ ͏ ͏                        | 6^2 = 36

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

```javascript
let lines = gets().split('\n');
var N = parseInt(lines.shift());
```

<br>

**📤 2. Saída de dados**<br>
 Vamos utilizar a instrução [**for**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/for) para definirmos os valores da saída.
 <br>
 Para calcularmos o valor de **i** ao quadrado, utilizaremos a função [**Math.pow(base, expoente)**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Math/pow).
 <br> 
 E para garantir que seja o quadrado apenas de números pares, vamos definir `i % 2 === 0`

```javascript
for (let i = 1; i <= N; i++) {
let quadrado = Math.pow(i, 2);

	if (i % 2 === 0) 
    console.log(`${i}^2 = ${quadrado}`);
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)
- [MDN Web Docs](https://developer.mozilla.org/pt-BR/)

<br>
