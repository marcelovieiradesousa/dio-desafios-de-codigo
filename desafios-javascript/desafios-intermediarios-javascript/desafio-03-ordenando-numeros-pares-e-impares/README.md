<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Intermediários JavaScript

## Desafio - Ordenando Números Pares e Ímpares
Desafio realizado no Bootcamp **Carrefour Web Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Crie um programa onde você receberá valores inteiros não negativos como entrada.**

**Ordene estes valores de acordo com o seguinte critério:**

- Primeiro os Pares
- Depois os Ímpares
- Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

📥 **Entrada de dados:** A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

📤 **Saída:** Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.


Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
10                          | 4
4  ͏ ͏ ͏ ͏                      | 32
32   ͏                       | 34
34   ͏                       | 98
543  ͏                       | 654
3456 ͏                       | 3456
654  ͏                       | 6789
567  ͏                       | 567
87   ͏                       | 543
6789                        | 87
98   ͏                       |

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>
Primeiro vamos definir o número de linhas de entrada, para isso vamos declarar a variável [**let**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/let) e identificá-la. Em seguida, utilizaremos a função **gets** para a leitura da entrada (inputs) dos dados, e utilizaremos a função [**parseInt**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/parseInt) para retornar o valor como número inteiro.

```javascript
let qntNumeros = parseInt(gets());
```

 Agora, vamos declarar variáveis e definir [arrays](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array) referentes aos números pares e ímpares:

```javascript
let pares = []
let impares = []
```

Em seguida, vamos identificar se o número é par ou ímpar. Para isso, vamos estabelecer a instrução [**for**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/for), definindo a condição de acordo com **qntNumeros**, seguida da variável **numero**, referente as próximas N linhas. E, sabendo que caso o **resto da divisão do número por 2 seja igual a 0**, o número será par, caso contrário será ímpar, vamos estabelecer **numero % 2 == 0** na condicional [**if**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/if...else).
 Para adicionar os itens aos arrays de acordo com a condição estabelecida, vamos utilizar o método [**push()**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array/push).


```javascript

for (let i = 0; i < qntNumeros; i++) {
  let numero = parseInt(gets());
  if (numero % 2 == 0){
    pares.push(numero);
  }
  else {
    impares.push(numero);
  }
}
  ```

O próximo passo é ordenar os arrays seguindo a definição no enunciado, sendo os **pares em ordem crescente** e os **ímpares em ordem decrescente**. Para isso, vamos utilizar o método [sort()](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array/sort).

```javascript
pares.sort((a, b) => a - b ); // a - b ordem crescente
impares.sort((a, b) => b - a ); // b - a ordem decrescente
```

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) com **console.log**, sendo primeiro os números pares em ordem crescente e na sequência os ímpares em ordem decrescente:

```javascript
for(let i = 0; i < pares.length;i++){
  console.log(pares[i]);
}

for(let i = 0; i < impares.length;i++){
  console.log(impares[i]);
}
```

Com isso, temos a seguinte solução:

```javascript
let qntNumeros = parseInt(gets());
let pares = []
let impares = []

for (let i = 0; i < qntNumeros; i++) {
  let numero = parseInt(gets());
  if (numero % 2 == 0){
    pares.push(numero);
  }
  else {
    impares.push(numero);
  }
}

pares.sort((a, b) => a - b ); // a - b ordem crescente
impares.sort((a, b) => b - a ); // b - a ordem decrescente

for(let i = 0; i < pares.length;i++){
  console.log(pares[i]);
}

for(let i = 0; i < impares.length;i++){
  console.log(impares[i]);
}
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)
- [MDN Web Docs](https://developer.mozilla.org/pt-BR/)

<br>
