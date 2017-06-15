class TestaForArrayList {
    public static void main(String [] args){

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("certificacao");
        nomes.add("java");

        for(String nome : nomes){
            System.out.println(nome);
        }

    }
}