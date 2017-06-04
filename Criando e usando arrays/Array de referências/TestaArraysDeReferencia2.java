class Prova {
}
class ProvaPratica extends Prova {
}

class TestaArraysDeReferencia2 {
    public static void main(String [] args){

        Prova[] provas = new Prova[10];
        provas[0] = new Prova();
        provas[1] = new ProvaPratica();

    }
}