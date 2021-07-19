package exercicio3;

/*calcule o imposto para gerente,supervisor e atendente
conforme o salário de cada um*/

public class Atendente extends Funcionarios {
    public double calculaImposto() {
        return this.getSalario() * 0.01;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
