package INDIVIDUOS;
import INDIVIDUOS.MODELS.*;

public class Cliente extends PessoaPadrao implements SistemaAutenticação{
    FuncoesSistemaAutenciacao funcoes;

    public Cliente(){
        funcoes = new FuncoesSistemaAutenciacao();
    }

    public boolean setSenha(int senha){
        return funcoes.setSenha(senha);
    }

    public int getSenha(){
        return funcoes.getSenha();
    }

    public boolean autentica(int senha){
        return funcoes.autentica(senha);
    }
}