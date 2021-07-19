package exercicio3;

public class Gerente extends Funcionarios {
    public double calculaImposto() {
        return this.getSalario() * 0.01;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
