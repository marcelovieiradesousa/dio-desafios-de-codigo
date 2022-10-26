//  RESOLUÇÃO DESAFIO ULTRAPASSANDO V
let R = parseInt(gets());
let V = 0

while(V <= R){ // enquanto V <= R for true, será executado:
  V = parseInt(gets())
}

let contNum = 0;
let contNumUltV = 0;

while(contNum <= V){ // enquanto contNum <= V for true, será executado:
  contNum += R;
  R++;
  contNumUltV++;
}

 console.log(contNumUltV); 
// RESOLUÇÃO DESAFIO ULTRAPASSANDO V END