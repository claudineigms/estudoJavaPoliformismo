package INDIVIDUOS.MODELS;

public abstract class FuncionarioPadrao extends PessoaPadrao{
	private double salario;
	public abstract double getBonificacao();

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}