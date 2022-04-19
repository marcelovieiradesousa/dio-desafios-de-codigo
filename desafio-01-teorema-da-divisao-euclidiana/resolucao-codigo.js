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