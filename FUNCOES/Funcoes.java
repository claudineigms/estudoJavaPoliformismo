package FUNCOES;

public class Funcoes {
    public boolean verifica_cpf(String cpf){
        String verificador = (cpf.replace(".", "")).replace("-", "");
        if (verificador.length() == 11){
            int ultimaParte = Integer.parseInt(verificador.substring(9, 11));
            String primeiraParte = verificador.substring(0, 9);
            int soma1 = 0;
            for (int numero=0; numero <=8; numero++){
                soma1 += (Integer.parseInt(primeiraParte.substring(numero,numero+1))*(10 - numero));
            }
            int soma2 = (11 - (soma1 % 11))*2;
            for (int numero=0; numero <=8; numero++){
                soma2 += (Integer.parseInt(primeiraParte.substring(numero,numero+1))*(11 - numero));
            }
            String resultado1 = Integer.toString(11 - (soma1 % 11));
            String resultado2 = Integer.toString(11 - (soma2 % 11));
            int resultado =  Integer.parseInt(resultado1+resultado2);
            if (resultado == ultimaParte){
                return true;
            }
            else{
                System.out.println("Favor Verificar seu cpf");
                return false;
            }
        }
        else
        {   
            System.out.println("Favor Verificar seu Cpf");
            return false;
        }
    }
}


