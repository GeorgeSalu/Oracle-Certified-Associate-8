interface A{
    void a();
}

class B implements A{
    void a(){
        // nao compila o metodo deveria ser publico
    }
}

class C implements A {
    public void a(){
        //compila
    }
}