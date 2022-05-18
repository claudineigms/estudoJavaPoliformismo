package FUNCOES;

import INDIVIDUOS.MODELS.FuncionarioPadrao;

public class ControleBonificacao {
    private double soma;

    public void registra(FuncionarioPadrao g){
        soma = soma + g.getBonificacao();
    }

    public double mostraSaldo(){
        return soma;
    }


}