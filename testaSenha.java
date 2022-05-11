import INDIVIDUOS.*;

public class testaSenha {
    public static void main(String[] args) {
        
        Cliente maikao = new Cliente();
        maikao.setSenha(2222);
        maikao.autentica(2222);
    }
}
