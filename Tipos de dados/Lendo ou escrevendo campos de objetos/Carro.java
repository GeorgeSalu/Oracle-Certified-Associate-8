class Carro {
    
    String modelo;
    int ano;

    public Carro() {
        ano = 2014;
    }

    public String getDadosDeImpressao(){
        return modelo + " - " + ano;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

}