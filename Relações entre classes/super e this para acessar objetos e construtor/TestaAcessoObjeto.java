class Mae {
    public Mae(String msg) {
        System.out.println(msg);
    }
}

class Filha extends Mae {
    public Filha(String nome) {
        super("construindo parte mae");
        System.out.println("construindo parte filha");
    }
}