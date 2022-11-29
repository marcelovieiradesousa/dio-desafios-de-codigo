<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Iniciais JavaScript

## Desafio - Somando Múltiplos
Desafio realizado no Bootcamp **Orange Tech +** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.**

📥 **Entrada de dados:** A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 

📤 **Saída:** A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.

**Exemplo 1**
Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
5                           | 50
20                          | 

**Exemplo 2**
Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
3                           | 63
18                          | 

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **console.log()**:
```javascript
console.log(somaMultiplos)
```

Com isso, temos a seguinte solução:
```javascript
let numeroA = parseInt(gets())
let limiteN = parseInt(gets())
let somaMultiplos = 0

for (let i = 0; i <= limiteN; i++) {
  if (i % numeroA == 0){
    let multiplo = i
    somaMultiplos += multiplo
  }
}

console.log(somaMultiplos)
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
