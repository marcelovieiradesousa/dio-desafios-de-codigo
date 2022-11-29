<div align="center">
  <img alt="JavaScript" height="100" src="https://raw.githubusercontent.com/FortAwesome/Font-Awesome/6.x/svgs/brands/js-square.svg">
</div>

<br>

# 💻 Desafios Iniciais JavaScript

## Desafio - FizzBuzz
Desafio realizado no Bootcamp **Orange Tech +** na [Digital Innovation One](https://www.dio.me/).

<br>

### 📝 **Enunciado**
#### **Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz".**

📥 **Entrada de dados:** Você receberá um número onde: 
Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ; 
Se o número for apenas múltiplo de 3 -> "Fizz" ; 
Se o número for apenas múltiplo de 5 -> "Buzz"; 
Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido; 

📤 **Saída:** Retorne a palavra correta de acordo com o seu múltiplo. Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme exemplo abaixo:

Exemplo de Entrada          | Exemplo de Saída
--------------------------- | ---------------------------
3                           | Fizz
5                           | Buzz
15                          | FizzBuzz 
4                           | 4

<br>

### ✅ **Resolução Comentada**

**📥 1. Entrada de dados**<br>

<br>

**📤 2. Saída de dados**<br>
Por fim, vamos imprimir a saída (output) de dados com **console.log()**:
```javascript
    console.log(fizzBuzz(resultado))
```

Com isso, temos a seguinte solução:
```javascript
let resultado = gets() // gets para pegar os dados de entrada na plataforma

function fizzBuzz(resultado){
  
  if (resultado % 3 == 0 && resultado % 5 == 0) {
    resultado = "FizzBuzz"

  } else if(resultado % 3 == 0 || resultado % 5 == 0) {
    resultado % 3 == 0 ? resultado = "Fizz" : resultado = "Buzz"
    
  } 
  
  return resultado
}

console.log(fizzBuzz(resultado))
```

<br>

### 🔎 **Referências**
- [Digital Innovation One](https://www.dio.me/)

<br>
