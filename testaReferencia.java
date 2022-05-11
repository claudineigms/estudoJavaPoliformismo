import INDIVIDUOS.FUNCIONARIO.Gerente;


public class testaReferencia {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marcão");
        System.out.println(g1.getNome()   );
    }
}
