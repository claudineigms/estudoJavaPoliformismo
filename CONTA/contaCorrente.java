package CONTA;

public class contaCorrente extends contaPadrao{

    @Override
    public boolean sacar(double valor) {
        double ValorASacar = valor + 0.1; //Cobança de 0.1 a cada movimentação que retira o valor da conta
        return super.sacar(ValorASacar);
    }

    public void depositar (double valor){
        if (valor > 0.01){ 
            valor = valor - 0.01;
            super.saldo += valor; 
            System.out.println("Deduçao de 0,01 sob IOF");
            System.out.println("Depósito efetuado com sucesso, o novo saldo da conta é " + valor);
        }
    }


}