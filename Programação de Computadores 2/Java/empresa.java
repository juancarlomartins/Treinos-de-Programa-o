public class empresa {

    static class Funcionario {
        private double salario;
        private String cargo;
        private String departamento;

        public Funcionario(double salario, String cargo, String departamento) {
            setSalario(salario);
            this.cargo = cargo;
            this.departamento = departamento;
        }    

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

        public String getCargo() {
            return cargo.toUpperCase();
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        String getDepartamento() {
            return departamento;
        }

        void setDepartamento(String departamento) {
            this.departamento = departamento;
        }
    }

    public static void main(String[] args) {

        Funcionario f = new Funcionario(2000, "analista", "TI");

        System.out.println("Salário: " + f.getSalario());
        System.out.println("Cargo: " + f.getCargo());
        System.out.println("Departamento: " + f.getDepartamento());
    }
}