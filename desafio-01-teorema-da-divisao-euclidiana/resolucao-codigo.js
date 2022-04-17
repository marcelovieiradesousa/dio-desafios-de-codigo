
// RESOLUÇÃO COM CÓDIGO SUGERIDO NO DESAFIO 
// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print para imprimir a saída (output) de dados.
// Abaixo segue um exemplo de código que você pode ou não utilizar

/* let line = gets().split(" ");
const a = parseInt(line[0]);
const b = parseInt(line[1]);

q = parseInt(a / b);

r = a - b * q;

if (r < 0) {
  r += Math.abs(b);
  
  q = (a - r) / b;    //escreva sua lógica aqui
}

print(q + " " + r); */
// RESOLUÇÃO COM CÓDIGO SUGERIDO NO DESAFIO END 


//  RESOLUÇÃO
let entrada = gets().split(' ');

let a = parseInt(entrada[0]);
let b = parseInt(entrada[1]);
let q = parseInt(a / b);
let r = a % b;

if (r < 0) {
  r += Math.abs(b);
  
  q = (a - r) / b;
}

console.log(q + ' ' + r);
// RESOLUÇÃO END