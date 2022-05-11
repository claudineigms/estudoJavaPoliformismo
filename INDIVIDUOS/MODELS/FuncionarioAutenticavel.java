package INDIVIDUOS.MODELS;

public abstract interface FuncionarioAutenticavel{
    
    public abstract boolean setSenha(int senha);
    public abstract int getSenha();
    public abstract boolean autentica(int senha);
}
