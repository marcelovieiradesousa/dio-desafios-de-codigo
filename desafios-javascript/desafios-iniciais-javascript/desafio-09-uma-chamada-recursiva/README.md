<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Iniciais JavaScript

## Desafio - Uma Chamada Recursiva
Desafio realizado no Bootcamp **Orange Tech +** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.**

📥 **Entrada de dados:** A Entrada será composta por um número inteiro, N. 

📤 **Saída:** Será  impresso o somatório de N até 0, como no exemplo a baixo:

**Exemplo 1**
Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
10                          | 55
4                           | 10
15                          | 120

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **console.log()**:
```javascript
console.log(somatorio(n))
```

Com isso, temos a seguinte solução:
```javascript
let n = parseInt(gets()) // gets para pegar os dados de entrada na plataforma

function somatorio(n){
  if (n == 0) {
      return 0
  } else {
      return n + somatorio(n - 1)
  }
}

console.log(somatorio(n))
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
