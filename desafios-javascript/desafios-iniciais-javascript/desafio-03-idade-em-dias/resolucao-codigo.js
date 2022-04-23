//  RESOLUÇÃO DESAFIO IDADE EM DIAS
let idadeEmDias = parseInt(gets());

let idadeEmAnos, idadeEmMeses;

idadeEmAnos = parseInt(idadeEmDias / 365);
idadeEmDias= idadeEmDias % 365;

idadeEmMeses= parseInt(idadeEmDias / 30);
idadeEmDias= idadeEmDias % 30;

let saida = (`${idadeEmAnos} ano(s) \n ${idadeEmMeses} mes(es) \n ${idadeEmDias} dia(s)`);

console.log(saida);
// RESOLUÇÃO DESAFIO IDADE EM DIAS END