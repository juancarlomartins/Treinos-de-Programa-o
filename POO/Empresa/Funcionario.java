package POO.Empresa;

public class Funcionario {
    // Criando os atributos dessa classe pai
    protected String nome;
    protected double salarioBase;
    protected int horasTrabalhadas;

    // Criando o construtor de funcionários
    public Funcionario(String nome, double salarioBase, int horasTrabalhadas){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Começando o encapsulamento dos atributos
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
