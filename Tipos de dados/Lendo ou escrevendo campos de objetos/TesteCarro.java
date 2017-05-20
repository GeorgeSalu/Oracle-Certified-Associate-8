class TesteCarro {

    public static void main(String[] args){
        Carro a = new Carro();
        a.modelo = "Palio";
        a.setModelo("Palio 2");

        System.out.println(a.getDadosDeImpressao());
    }

}