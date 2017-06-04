class TestaArraysCasting {
    public static void main(String [] args){

        String[] valores = new String[2];
        valores[0] = "Certificacao";
        valores[1] = "Java";

        Object[] vals = valores;
        for(Object valor : vals){
            System.out.println(valor);
        }

    }
}