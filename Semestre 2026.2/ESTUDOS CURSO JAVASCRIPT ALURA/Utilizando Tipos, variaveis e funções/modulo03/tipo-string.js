//Estudando o tipo de dado string.
const estudante = "juan";
const docente = 'Carlos';

const cumprimento = "Nosso lema é 'Estudar bastante!'"; //Como usar aspas dentro de aspas.
const citacao = `Ju diz "Nosso lema é 'estudar bastante!'"`;

console.log(estudante);
console.log(docente);
console.log(cumprimento);
console.log(citacao);

// + -> também é usado para concatenar strings.

console.log(`O estudante ${estudante}, é aluno do professor ${docente}, e a ${citacao}.`); //`` uso de crase no template string.

console.log("\n\n");

const senha = 'senhaSegura123' + estudante.toUpperCase(); //toUpperCase() = pega todas as strings e deixa em caixa alta.
console.log(senha);

const cifrao = '\u0024';
const aMaiusculo = '\u0041';
const tique = '\u2705';
const hiragana = '\u3041';

console.log(`1- ${cifrao}.\n2- ${aMaiusculo}.\n3- ${tique}.\n4- ${hiragana}.`);

