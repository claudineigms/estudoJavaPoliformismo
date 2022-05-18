package CONTA;

public class calculadorDeImposto{
    
    private float totalImposto;

    public void getValorImposto(tributacao t) {
        double valor = t.getValorImposto();
        totalImposto += valor;
    }

    public double getValorImposto(){
        return totalImposto;
    }
}
