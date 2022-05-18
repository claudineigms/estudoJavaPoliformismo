package INDIVIDUOS.MODELS;

public class FuncoesSistemaAutenciacao implements SistemaAutenticação{
    private int senha;
    
    public boolean setSenha(int senha){
        if (senha>0){
            this.senha=senha;
            return true;
        }
        else{
            System.out.println("Favor Conferir sua Senha");
            return false;
        }
    }
    public int getSenha(){
        return this.senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Logado com Sucesso!");
            return true;
        }else{
            System.out.println("Tente Novamente");
            return false;
        }
    }
}
