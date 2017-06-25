class Mae {
    public Mae() {
        System.out.println("construindo parte mae");
    }
}

class Filha extends Mae {
    public Filha() {
        // super() implicito!
        System.out.println("construindo filha parte 1");
    }

    public Filha(String nome) {
        this();
        System.out.println("construindo filha parte 2");
    }
}

public class X{
    public static void main(String [] args){
        Filha filha = new Filha("Teste");
    }
}