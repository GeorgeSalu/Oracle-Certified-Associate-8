class TestaCasting {
    public static void main(String...args){
        Object[] objetos = new Object[100];

        String s = "certificacao";
        objetos[0] = s;

        //nao compila
        String recuperada = objetos[0];
    }
}