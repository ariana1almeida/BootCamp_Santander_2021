package exercicio3;

public class Funcionarios {

    public double salario;

    public double getSalario() {
        return salario;
    }

    public static void main(String[] args) {
        Funcionarios gerente = new Gerente();
        gerente.setSalario(3950);
        System.out.println(gerente.calculaImposto());

        Funcionarios supervisor = new Supervisor();
        supervisor.setSalario(1850);
        System.out.println(supervisor.calculaImposto());

        Funcionarios atendente = new Atendente();
        atendente.setSalario(1355);
        System.out.println(atendente.calculaImposto());
    }

    private double calculaImposto() {
        return this.getSalario() * 0.01;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
