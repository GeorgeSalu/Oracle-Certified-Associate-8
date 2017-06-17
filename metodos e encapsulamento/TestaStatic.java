class Moto {

    public static int getTotalDeMotos(){
        return Moto.totalDeMotos;
    }

    public static final int PADRAO_TOTAL_DE_MOTOS = 8;
    public static int totalDeMotos = PADRAO_TOTAL_DE_MOTOS;



}

class TestaStatic {
    public static void main(String [] args){

        System.out.println(Moto.getTotalDeMotos());

    }
}