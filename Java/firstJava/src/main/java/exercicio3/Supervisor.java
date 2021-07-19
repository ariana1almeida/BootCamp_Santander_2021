package exercicio3;

public class Supervisor extends Funcionarios {
    public double calculaImposto(){
        return this.getSalario() * 0.05;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
