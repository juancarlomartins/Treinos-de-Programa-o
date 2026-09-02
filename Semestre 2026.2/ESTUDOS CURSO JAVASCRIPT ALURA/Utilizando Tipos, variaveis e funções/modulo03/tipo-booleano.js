// Tipo de dado especial que tem dois valores.

const estudante = "Juan";
const estaAprovado = true;

if (estaAprovado == true){
    console.log(`Parabéns ${estudante}, você passou!\n`);
} else {
    console.log("Você ficou de recuperação\n");
}

//Outro tipo de uso com if.

if (estaAprovado){ //Como o valor já é verdadeiro então é aceita a condição.
    console.log(`Parabéns ${estudante}, você passou!\n`);
} else {
    console.log("Você ficou de recuperação\n");
}

//Testando outros resultados

console.log("\n");
if (estudante == "Juan"){
    console.log(`Olá, ${estudante}`);
} else{
    console.log('quem é você?');
}