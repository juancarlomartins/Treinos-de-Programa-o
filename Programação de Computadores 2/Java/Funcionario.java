public class Funcionario {

    // 1) Todos os atributos privados
    private double salario;
    private String cargo;
    private String departamento;

    // Construtor
    public Funcionario(double salario, String cargo, String departamento) {
        setSalario(salario);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    // 2) Setter de salário com validação
    public void setSalario(double salario) {
        if (salario >= 1412.00) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("Salário não pode ser menor que R$ 1.412,00");
        }
    }

    public double getSalario() {
        return salario;
    }

    // 3) Getter de cargo em maiúsculas
    public String getCargo() {
        return cargo.toUpperCase();
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // 4) Departamento com acesso package-private (sem public/private)
    String getDepartamento() {
        return departamento;
    }

    void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}