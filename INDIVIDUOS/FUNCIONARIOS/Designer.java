package INDIVIDUOS.FUNCIONARIOS;

import INDIVIDUOS.MODELS.FuncionarioPadrao;

public class Designer extends FuncionarioPadrao {
    int publicacoesCriadas;

    public double getBonificacao() {
        return super.getSalario()*0.05;
    }
}
