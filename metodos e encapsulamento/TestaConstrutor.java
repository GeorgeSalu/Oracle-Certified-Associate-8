class A {

    int i = 15;
    String nome;
    int tamanho = tamanhoSobrenome();
    String sobrenome = "java";

    A(String nome){
        this.nome = nome;
    }

    int tamanhoSobrenome(){
        return nome.length();
    }

    A(){
    }

}

class TestaConstrutor {
    public static void main(String [] args){
        A a = new A();
        A b = new A("certificacao");
        System.out.println(b.i);
    }
}