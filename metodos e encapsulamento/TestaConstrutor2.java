class Livro {
    Livro(){
        System.out.println("sem argumentos");
    }
    Livro(String... s){
        System.out.println("String");
    }
    Livro(int i){
        this();
        System.out.println("construtor com int")
    }
    String valor(){
        return "xpto";
    }
}

class TestaConstrutor2 {
    public static void main(String [] args){
        Livro l = new Livro(234);
    }
}