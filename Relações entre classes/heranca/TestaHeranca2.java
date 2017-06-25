class Pai {
    Pai(int x){
    }
}

class Filho1 extends Pai{
    //nao compila pois o construtor padrao chama super()
    //e o pai nao tem construtor vazio
}

class Filho2 extends Pai{
    Filho2(){
        super(2); //compila
    }
}

