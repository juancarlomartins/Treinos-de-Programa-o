//Entendendo escopos.

if (1 > 0){
    let nome = 'Juan Martins';
    console.log(nome);
}

nome = 'Carlos Alberto'; // --> variável diferente, o sistema atribui um var (escondido), 
//Isso acontece por causa do escopo, o javascript trabalha com 3 tipos de escopos: bloco, função e global.
console.log(nome);