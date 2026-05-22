package POO;

public class Eletronico extends produto {
    private int garantia;

    // Construtor dessa categoria
    public Eletronico(String nomeP, double precoP, int quantidadeEstoque, int garantia){
        super(nomeP, precoP, quantidadeEstoque);
        this.garantia = garantia;
    }

    // encapsulando o novo atributo
    public void setGarantia(int garantia){
        this.garantia = garantia;
    }
    public int getGarantia(){
         return garantia;
    }

    @Override
    public void exibirInfo(String nomeP, double precoP, int quantidadeEstoque){
        System.out.println("=== Informações do produto ===");
        System.out.println("Produto: " + nomeP);
        System.out.println("Preço: " + precoP);
        System.out.println("Quantidade no estoque: " + quantidadeEstoque);
        System.out.println("garantia: " +  garantia);
        System.out.println("===============================");
    }

    // metódo específico dessa classe
    public void temGarantiaLonga(int garantia){
        if (garantia >= 12){
            System.out.println("Esse produto tem garantia longa");
        } else {
            System.out.println("Esse produto não possui garantia longa");
        }
    }
}
