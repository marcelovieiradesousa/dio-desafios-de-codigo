//  RESOLUÇÃO UMA CHAMADA RECURSIVA
// gets para pegar os dados de entrada na plataforma
let n = parseInt(gets())

function somatorio(n){
  if (n == 0) {
      return 0
  } else {
      return n + somatorio(n - 1)
  }
}

console.log(somatorio(n))
// RESOLUÇÃO UMA CHAMADA RECURSIVA END