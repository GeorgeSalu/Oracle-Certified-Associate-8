class A {
    static void A(){ // não compila
    }

    void a(){ //nao compila
    }
}

class B {
    static void a(){
    }
}

class c extends B {
    void a(){ //nao compila     
    }
}