class Param {
    void primitivo(double a){
        return;
    }
    void referencia(Object o){
    }
    void teste(final int a,int b){
        b = 10;
    }
}

class ClasseComMetodos {
    int getNumeros(){
        return 5;
    }
}

class TestaMetodos {
    public static void main(String [] args){
        Param p = new Param();
        int a = 1;
        p.primitivo('Z');
        p.referencia("guilherme");
        p.referencia(new Object());
        p.teste(1,2);
    }
}