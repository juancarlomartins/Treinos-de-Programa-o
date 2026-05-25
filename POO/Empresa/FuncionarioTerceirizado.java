package POO.Empresa;

public class FuncionarioTerceirizado extends Funcionario{
    
    protected String empresaOrigem;
    protected double taxaAdicional;

    public FuncionarioTerceirizado(String nome, double salarioBase, int horasTrabalhadas, String empresaOrigem, double taxaAdicional){
        super(nome, salarioBase, horasTrabalhadas);
        this.empresaOrigem = empresaOrigem;
        this.taxaAdicional = taxaAdicional;
    }

    public void setEmpresaOrigem(String empresaOrigem){
        this.empresaOrigem = empresaOrigem;
    }
    public String getEmpresaOrigem(){
        return empresaOrigem;
    }
    public void setTaxaAdicional(double taxaAdicional){
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public double CalcularSalario(){
        return salarioBase + (horasTrabalhadas * (10 + taxaAdicional)); // específico para esse tipo de funcionário.
    }

    public double CalcularBonus(){
        return CalcularSalario() * 0.1;
    }

    public void exibirInfo(){
        System.out.println("\n=== Informações do Funcionário === ");
        System.out.println("Nome: " +  nome);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Total a receber: " + CalcularSalario());
        System.out.println("Bonus: " + CalcularBonus());
        System.out.println("Total Final: " + CalcularBonus() + CalcularSalario());
    }
}
