//  RESOLUÇÃO BUSCA SEQUENCIAL
let elementos = [64, 137, -16, 43, 67, 81, -90, 212, 10, 75]
// gets para pegar os dados de entrada na plataforma
let valor = parseInt(gets())
let i

for (i = 0; i < elementos.length; i++) {
  if(elementos[i] == valor) {
    console.log("Achei " + valor + " na posicao " + i)
    break
  } 
}

if(i == elementos.length){
  console.log("Numero " + valor + " nao encontrado!")
}
// RESOLUÇÃO BUSCA SEQUENCIAL END