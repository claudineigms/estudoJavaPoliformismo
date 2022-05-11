import CONTA.*;;

public class testaValores {
    public static void main(String[] args) {
        contaCorrente contaDoMaike = new contaCorrente();
        contaDoMaike.depositar(0.01);
        System.out.println(contaDoMaike.getSaldo());
        contaDoMaike.depositar(10.00);
    }
}
