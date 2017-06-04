class TestaArraysDeReferencia {
    public static void main(Strign [] args){
        
        //declaracao e inicializacao de um array de provas
        Prova[] provas = new Prova[10];

        //erro de execucao ao tentar aplicar o operador "."
        //em uma referencia com valor null
        //NullPointerException
        provas[0].tempo = 10;

        //percorrer um array
        for(int i = 0;i < provas.length;i++){
            provas[i] = new Prova();
            provas[i].tempo = 210;
        }

        for(Prova prova : provas){
            System.out.println(prova.tempo);
        }

    }
}