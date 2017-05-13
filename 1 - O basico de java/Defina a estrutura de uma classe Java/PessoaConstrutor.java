class PessoaConstrutor{

    String nome;
    String sobrenome;

    PessoaConstrutor(String nome,String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return this.nome + this.sobrenome;
    }

}