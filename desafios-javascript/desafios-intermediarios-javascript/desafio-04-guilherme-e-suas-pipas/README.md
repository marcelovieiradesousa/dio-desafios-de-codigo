<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Intermediários JavaScript

## Desafio - Guilherme e suas Pipas
Desafio realizado no Bootcamp **Santander Fullstack Developer** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Guilherme adora brincar com pipas, pipas de várias cores, formas e tamanhos. Ele tem percebido que para as pipas possuírem maior estabilidade, e dessa forma voarem mais alto, elas devem possuir um barbante bem esticado ligando todos os pares de pontas não vizinhas.**<br>
**Apesar de ser uma criança bastante criativa e astuta, Guilherme não sabe como determinar a quantidade de barbantes que ele terá que utilizar para tornar uma pipa de n lados, estável. Você pode ajudá-lo?.**


📥 **Entrada de dados:** A entrada será composta por uma única linha, que contém um inteiro 3 ≤ **n** ≤ 105, representando o número de lados da pipa.

📤 **Saída:** Imprima um número inteiro, que será a quantidade de barbantes que Guilherme terá que utilizar para tornar a pipa de **n** lados estável.


Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
4                           | 2
10                          | 35
11                          | 44

Tapioca's Round I, 2015

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>
Primeiro vamos definir o número de linhas de entrada, para isso vamos declarar a variável [**let**](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Statements/let) e identificá-la. Em seguida, utilizaremos a função **gets** para a leitura da entrada (inputs) dos dados...

```javascript
let lines = gets().split("\n");

let N = parseInt(lines.shift());
```

Sabendo o barbante deve ligar **todos os pares de pontas não vizinhas**, e considerando uma pipa comum (plana) onde um lado corresponde a uma aresta, temos que cada lado possui 2 vértices/pontas (N = um lado = 2 pontas).<br>
 Sob esse aspecto, cada ponta pertence a 2 lados da pipa (o lado que está e o adjacente junto com outra ponta - oposta a atual). Logo em um lado temos 2 pontas que pertencem a 3 lados no total (o que elas estão, e o adjacente a cada uma). 

```javascript
let resposta = ((N - 3 ) * N ) / 2; 
```

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) com **console.log**:

```javascript
console.log(resposta);
```

Com isso, temos a seguinte solução:

```javascript
let lines = gets().split("\n");

let N = parseInt(lines.shift());

let resposta = ((N - 3 ) * N ) / 2; 
console.log(resposta);
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)
- [MDN Web Docs](https://developer.mozilla.org/pt-BR/)

<br>
