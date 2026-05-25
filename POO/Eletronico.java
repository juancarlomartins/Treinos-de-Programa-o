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
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Garantia: " + garantia + " meses.");
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
