package POO;

public class Eletronico extends produto {
    private String garantia;

    // Construtor dessa categoria
    public Eletronico(String nomeP, double precoP, int quantidadeEstoque, String garantia){
        super(nomeP, precoP, quantidadeEstoque);
        this.garantia = garantia;
    }
}
