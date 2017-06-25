class Filha extends Object {
    public Filha() {
        // super() implicito!
    }

    public Filha(String nome) {
        this();
    }

    public Filha(int idade) {
        super();
        this(); // não compila, ou um ou outro!
    }
    public Filha(long valor) {
        this();
        this(); // não compila, só uma vez!
    }

    public Filha(char caracter) {
        super();
        super(); // não compila, só uma vez!
    }
}