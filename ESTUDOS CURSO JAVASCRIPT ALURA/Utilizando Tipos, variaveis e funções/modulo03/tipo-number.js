let prova1 = Number.parseInt("8"); //convertendo uma string para um valor inteiro.
let prova2 = 6.3;
let prova3 = 5.5;
let prova4 = Number.parseFloat("8.7"); //Convertendo uma string para um valor real.

let total = prova1 + prova2 + prova3 + prova4;
let media = total/4;

console.log("Soma das notas: ", total);
console.log("Média das notas: ", media.toFixed(2));//.toFixed para controlar as casas decimais do resultado final.