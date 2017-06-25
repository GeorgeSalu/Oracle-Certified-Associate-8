import java.util.*;

class Conta {
    int id;
}
class ContaJuridica extends Conta{
    Strng cnpj;
}
class TestaTipoReferencia {
    public static void main(String [] args){
        Conta c = new ContaJuridica();
        c.id = 15;

    }
}