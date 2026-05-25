package POO.loja;

public class produto {
    private String nomeP;
    private double precoP;
    private int quantidadeEstoque;

    //criando o construtor de produto da loja
    public produto(String nomeP, double precoP, int quantidadeEstoque){
        this.nomeP = nomeP;
        this.precoP = precoP;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // fazendo o encapsulamento das atributos
    public void setNomeP(String nomeP){
        this.nomeP = nomeP;
    }
    public String getNomeP(){
        return nomeP;
    }
    public void setPrecoP(double precoP){
        this.precoP = precoP;
    }
    public double getPrecoP(){
        return precoP;
    }
    public void setQuatidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    // agora vou criar os métodos necessários.
    public double calcularVatorTotal(){
        return precoP * quantidadeEstoque;
    }

    // método para exibir todas as informações de um produto.
    public void exibirInfo(){ // estrutura corrigida para funcionar
        System.out.println("=== Informações do produto ===");
        System.out.println("Produto: " + nomeP);
        System.out.println("Preço: R$ " + precoP);
        System.out.println("Estoque: " + quantidadeEstoque + " unidades");
        System.out.println("Valor total em estoque: R$ " + calcularVatorTotal());
    }
}
