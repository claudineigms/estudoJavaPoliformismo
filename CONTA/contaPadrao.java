package CONTA;
import INDIVIDUOS.MODELS.*;

public abstract class contaPadrao{
    protected double saldo = 0;
    private int agencia = 1;
    static int ContNum = 1;
    private int numero;
    //aqui se deve alterar o funcionario para pessoa e alterar desde cliente, uma pessoa, ou outro derivado
    private FuncionarioPadrao titular;

    public contaPadrao(){
        System.out.println("Criando a nova conta "+ContNum);
        this.numero = ContNum;
        ContNum += 1;
    }

    public abstract void depositar(double valor);

    public boolean sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Depósito efetuado com sucesso, o novo saldo da conta é " + valor);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transfereSaldo(contaPadrao contaPara, double valor){
        if (this.saldo >= valor){
            sacar(valor);
            contaPara.depositar(valor);
            return true;
        }
        else{
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public FuncionarioPadrao getTitular() {
        return titular;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0){
            this.agencia = agencia;
            }
        else{
            System.out.println("O valor da Agência é invalida, favor verificar");
        }
    }

    public void setTitular(FuncionarioPadrao titular) {
        this.titular = titular;
    }

    public void setNumero(int novoNumero){
        if (agencia > 0){
            this.numero = novoNumero;
            }
        else{
            System.out.println("O valor da Conta é invalida, favor verificar");
        }
    }

    
}
