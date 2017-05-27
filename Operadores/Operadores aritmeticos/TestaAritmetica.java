class TestaAritmetica {
    public static void main(String [] args){

        int dois = 2;
        int dez = 10;

        int doze = dez + dois;
        int oito = dez - dois;
        int vinte = dez * dois;
        int cinco = dez / dois;
        int restoDaDivisaoDeCincoPorDois = 5 % 2;
        
        System.out.println((dois+0)/0);

        // NaN
        double positivoInfinito = 5.0 / 0;
        double negativoInfinito = 5.0 / 0;
        System.out.println(positivoInfinito + negativoInfinito);

    }
}