package INDIVIDUOS.MODELS;
import FUNCOES.*;

public class PessoaPadrao {
    //aqui se deve colocar todo tipo de individuo com caminho inicial por aqui
    private String nome;
	private String cpf;

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

}
