import CONTA.*;
import INDIVIDUOS.FUNCIONARIO.*;

public class testaConta {
    public static void main(String[] args) {
    Gerente Claudin = new Gerente();
    Claudin.setNome("Claudinei da Silva Gomes");
    contaPadrao ContaDoClaudin = new contaPoupanca();
    
    ContaDoClaudin.setTitular(Claudin);
    System.out.println(ContaDoClaudin.getTitular().getNome());
    }
    
}
