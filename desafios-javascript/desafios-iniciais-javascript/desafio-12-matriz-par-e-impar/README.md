<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Iniciais JavaScript

## Desafio - Busca Sequencial
Desafio realizado no Bootcamp **Orange Tech +** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Seu Raimundo tem uma lista de números. Porém, ele gosta muito das coisas em ordem e deseja que você o ajude a construir um programa que pegue todas as listas dele, uma de cada vez, e coloque os inteiros pares no início e os inteiros ímpares no final.** 

📥 **Entrada de dados:** A entrada são arrays de tamanho variado que possuem somente números inteiros.

📤 **Saída:** A saída deverá retornar todos os valores pares para o começo do array, seguido pelos ímpares.

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **console.log()**:
```javascript
console.log(orderedNumbers.join(','))
```

Com isso, temos a seguinte solução:
```javascript
// gets para pegar os dados de entrada na plataforma
let numbers = gets().split('')
let orderedNumbers = []

for (let i = 0; i < numbers.length; i++){
    if (numbers[i] % 2 == 0) orderedNumbers.unshift(numbers[i])
    else orderedNumbers.push(numbers[i])
}

console.log(orderedNumbers.join(','))
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
