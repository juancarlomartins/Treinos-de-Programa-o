package interfaces;

public class Funcionario {
    private String nome;
    private double salario;
    private int idade;
    private String cargo;

    public Funcionario(String nome, double salario, int idade, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.cargo = cargo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return cargo;
    }

    public void exibirInfo(){
        System.out.println("=== Informações do funcionário ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + exibirSalario());

    }

    public double exibirSalario(){
        return salario;
    }
}
