package POO;

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
    public void calcularVatorTotal(double precoP, int quantidadeEstoque){
        double resultado;
        if (quantidadeEstoque != 0){
            resultado = precoP * quantidadeEstoque;
            System.out.println("Valor final da compra: " + resultado);
        } else {
            System.out.println("O estoque desse produto acabou, volte sempre!");
        }
    }

    // método para exibir todas as informações de um produto.
    public void exibirProduto(String nomeP, double precoP, int quantidadeEstoque){
        
    }
}
