package INDIVIDUOS.FUNCIONARIO;

import INDIVIDUOS.MODELS.*;

public class Gerente extends FuncionarioPadrao implements FuncionarioAutenticavel{
	private int senha;
	
	@Override
	public boolean setSenha(int senha) {
		if(senha > 0){
			this.senha=senha;
			return true;
		} else {
			System.out.println("Informar uma Senha Válida!");
			return false;
		}
	}

	@Override
	public int getSenha() {
		return this.senha;
	}

	public double getBonificacao() {
	    return super.getSalario();	
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}