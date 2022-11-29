//  RESOLUÇÃO FIZZBUZZ
// gets para pegar os dados de entrada na plataforma
let resultado = gets()

function fizzBuzz(resultado){
  
  if (resultado % 3 == 0 && resultado % 5 == 0) {
    resultado = "FizzBuzz"

  } else if(resultado % 3 == 0 || resultado % 5 == 0) {
    resultado % 3 == 0 ? resultado = "Fizz" : resultado = "Buzz"
    
  } 
  
  return resultado
}

console.log(fizzBuzz(resultado))
// RESOLUÇÃO FIZZBUZZ END