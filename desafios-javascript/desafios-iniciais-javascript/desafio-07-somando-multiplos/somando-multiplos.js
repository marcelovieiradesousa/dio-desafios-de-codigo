//  RESOLUÇÃO SOMANDO MÚLTIPLOS
// gets para pegar os dados de entrada na plataforma
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
// RESOLUÇÃO SOMANDO MÚLTIPLOS END