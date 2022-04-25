//  RESOLUÇÃO DESAFIO ORDENANDO NÚMEROS PARES E ÍMPARES V
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
// RESOLUÇÃO DESAFIO  ORDENANDO NÚMEROS PARES E ÍMPARES END