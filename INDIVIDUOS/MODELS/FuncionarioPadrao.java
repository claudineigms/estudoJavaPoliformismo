package INDIVIDUOS.MODELS;
import FUNCOES.*;

public abstract class FuncionarioPadrao {
	private String nome;
	private String cpf;
	private double salario;
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		Funcoes funcao = new Funcoes();
		if (funcao.verifica_cpf(cpf)){
			this.cpf = cpf;
		}
		else{

		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}