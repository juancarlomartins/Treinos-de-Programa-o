public class Pessoa {
    //inicializando a variáveis da classe pessoa.
    String nome;
    int idade;

    // --- Construtor ---
    public Pessoa(String nomeInformado, int idadeInformada) {
        //Inicializando com os valores recebidos.
        nome = nomeInformado;
        idade = idadeInformada;
        System.out.println("Cadastro criado com sucesso!\n");
    }
}
