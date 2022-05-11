import FUNCOES.ControleBonificacao;
import INDIVIDUOS.FUNCIONARIO.*;
import INDIVIDUOS.MODELS.FuncionarioPadrao;

public class testeBonificacao {
    public static void main(String[] args) {
        FuncionarioPadrao Claudin = new Gerente();
        ControleBonificacao g1 = new ControleBonificacao();

        Claudin.setSalario(5000.00);
        
        g1.registra(Claudin);
        
        System.out.println(g1.mostra());

    }
}
