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
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public int getHorasTrabalhadas(){
        return horasTrabalhadas;
    }

    // Criando os métodos dessa classe
    public double CalcularSalario(){
        return salarioBase + (horasTrabalhadas * 10);
    }

    // para exibir as informações gerais desse funcionário.  
    public void exbirInfo(){
        System.out.println("\n=== Informações do Funcionário === ");
        System.out.println("Nome: " +  nome);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Total a receber: " + CalcularSalario());
    }
}
