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

    // fazendo o encapsulamento das variáveis
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
    
}
