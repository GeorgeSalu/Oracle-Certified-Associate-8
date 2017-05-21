class Pessoa {
    
    String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
class Teste {
    public static void main(String[] args){
        Pessoa p = new Pessoa();

        //chamando o metodo na variavel de ref;
        p.setNome("Mario");

        //atribuindo o retorno do metodo a variavel.
        String nome = p.getNome();

        //erro, metodo é void
        String a = p.setNome("x");

    }
}