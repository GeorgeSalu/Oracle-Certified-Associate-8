class TestaFor {
    public static void main(String [] args){

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0;i < numeros.length; i++){
            int numero = numeros[i];
            System.out.println(numero);
        }

        for(int numero : numeros)
            System.out.println(numero);

    }
}