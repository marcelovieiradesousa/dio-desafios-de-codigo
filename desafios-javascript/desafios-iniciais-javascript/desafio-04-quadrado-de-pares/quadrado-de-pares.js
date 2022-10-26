//  RESOLUÇÃO QUADRADO DE PARES
let lines = gets().split('\n');
var N = parseInt(lines.shift());

for (let i = 1; i <= N; i++) {
 let quadrado = Math.pow(i, 2);

 if (i % 2 === 0) 
 console.log(`${i}^2 = ${quadrado}`);
}
// RESOLUÇÃO QUADRADO DE PARES END
