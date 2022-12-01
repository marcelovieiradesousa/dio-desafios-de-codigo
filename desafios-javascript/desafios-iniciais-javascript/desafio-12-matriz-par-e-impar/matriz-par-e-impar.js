//  RESOLUÇÃO MATRIZ PAR E IMPAR
// gets para pegar os dados de entrada na plataforma
let numbers = gets().split('')
let orderedNumbers = []

for (let i = 0; i < numbers.length; i++){
    if (numbers[i] % 2 == 0) orderedNumbers.unshift(numbers[i])
    else orderedNumbers.push(numbers[i])
}

console.log(orderedNumbers.join(','))
// RESOLUÇÃO MATRIZ PAR E IMPAR END
