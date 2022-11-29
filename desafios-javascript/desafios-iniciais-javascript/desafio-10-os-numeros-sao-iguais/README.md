<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Iniciais JavaScript

## Desafio - Os Númeoros são Iguais?
Desafio realizado no Bootcamp **Orange Tech +** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas.**

📥 **Entrada de dados:** As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros. 

📤 **Saída:** A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário,  retorne "Nao sao iguais!", sem as aspas.

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
1                           | Nao sao iguais!
2                           | 
50                          | Sao iguais!
50                          | 
38                          | Nao sao iguais!
90                          | 

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **console.log()**:
```javascript
console.log(compararNumeros)
```

Com isso, temos a seguinte solução:
```javascript
// gets para pegar os dados de entrada na plataforma
let A = gets()
let B = gets()

const compararNumeros = (A == B) ? "Sao iguais!" : "Nao sao iguais!"

console.log(compararNumeros)
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
