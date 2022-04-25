<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Iniciais JavaScript

## Desafio - Idade em dias
Desafio realizado no Bootcamp **Carrefour Web Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado (sintetizado)**
#### **Ler um valor inteiro correspondente à idade de uma pessoa em dias e informá-lo em anos, meses e dias.**

>Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 

📥 **Entrada:** O arquivo de entrada contém um valor inteiro.

📤 **Saída:** Imprima a saída conforme exemplo fornecido.

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
400                         | 1 ano(s)
 ͏ ͏ ͏ ͏                        | 1 mes(es)
 ͏ ͏ ͏ ͏                        | 5 dia(s)

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
800                         | 2 ano(s)
 ͏ ͏ ͏ ͏                        | 2 mes(es)
 ͏ ͏ ͏ ͏                        | 10 dia(s)

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
30                          | 0 ano(s)
 ͏ ͏ ͏ ͏                        | 1 mes(es)
 ͏ ͏ ͏ ͏                        | 0 dia(s)

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>
Primeiro vamos definir a entrada dos dados, que será a **idade de uma pessoa em dias**, para isso vamos declarar a variável [**let**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/let) e identificá-la. Em seguida, utilizaremos a função **gets** para a leitura da entrada (inputs) dos dados. E, sabendo que a entrada é um **valor inteiro**, utilizaremos a função [**parseInt**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/parseInt) para retornar o valor como número inteiro.

```javascript
let idadeEmDias = parseInt(gets());
```

Agora, vamos definir as variáveis referentes a **idade em anos e em meses**. Conforme consta no enunciado, considerando todo ano com 365 dias e todo mês com 30 dias, vamos dividir a **idadeEmDias** por esses valores. Para obter a idade em dias final (que é dada com os anos e meses) vamos calcular o resto da idade em dias da entrada por esses valores.

```javascript
let idadeEmAnos, idadeEmMeses;

idadeEmAnos = parseInt(idadeEmDias / 365);
idadeEmDias= idadeEmDias % 365;

idadeEmMeses= parseInt(idadeEmDias / 30);
idadeEmDias= idadeEmDias % 30;
```

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **console.log**, utilizando [**template strings**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Template_literals) e quebrando a linha com **\n**:

```javascript
let saida = (`${idadeEmAnos} ano(s) \n ${idadeEmMeses} mes(es) \n ${idadeEmDias} dia(s)`);

console.log(saida);
```

<br>

Com isso, temos a seguinte solução:

```javascript
let idadeEmDias = parseInt(gets());

let idadeEmAnos, idadeEmMeses;

idadeEmAnos = parseInt(idadeEmDias / 365);
idadeEmDias= idadeEmDias % 365;

idadeEmMeses= parseInt(idadeEmDias / 30);
idadeEmDias= idadeEmDias % 30;

let saida = (`${idadeEmAnos} ano(s) \n ${idadeEmMeses} mes(es) \n ${idadeEmDias} dia(s)`);

console.log(saida);
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)
- [MDN Web Docs](https://developer.mozilla.org/pt-BR/)

<br>
