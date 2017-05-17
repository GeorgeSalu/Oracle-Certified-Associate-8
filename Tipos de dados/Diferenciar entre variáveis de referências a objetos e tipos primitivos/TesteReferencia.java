class Objeto {
    int valor;
}

class TesteReferencia {

    public static void main(String[] args){

        Objeto a = new Objeto();
        Objeto b = a; // agora b aponta para o mesmo objeto de a

        a.valor = 5;

        System.out.println(b.valor);
    }

}