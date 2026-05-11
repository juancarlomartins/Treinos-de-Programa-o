public class Main{
    public static void main(String[] args) {
        System.out.println("Olá seja bem-vindo,\nvamos criar um novo usuário:");

        // O construtor Pessoa é chamado aqui, automaticamente, pelo 'new'
        Pessoa p1 = new Pessoa("João", 23);
        //Agora p1.nome = "João", e p1.idade = 30;

        System.out.println("Seja bem-vindo "+p1.nome+", você tem "+p1.idade+" anos.\n");
    }
}