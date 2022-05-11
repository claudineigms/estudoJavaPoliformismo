package CONTA;

public class contaPoupanca extends contaPadrao {
    
    public void depositar(double valor){
        if (valor > 0){
            super.saldo += valor;
            System.out.println("Depósito efetuado com sucesso, o novo saldo da conta é " + valor);
        }

    }
}
