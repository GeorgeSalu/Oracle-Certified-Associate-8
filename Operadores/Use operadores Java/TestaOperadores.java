class TestaOperadores {
    public static void main(String [] args){

        long idade = ; // não compila, onde esta o valor
        long = 15; // não compila, esta o nome da variavel
        long idade = 15; // compila

        int a = 10; // tipos iguais
        long b = 20; //int cabe em um long 
        float c = 10f //tipos iguais
        double d = 20.0f // float cabe em um double 
        double e = 30.0; // tipos iguais
        float f = 40.0;  // erro. double não cabe em um  float
        int g = 10l;  //erro, long não cabe em int
        float h = 10l;  //inteiros cabem em decimal
        double i = 20;  // inteiros cabem em decimais
        long j = 20f;   // decimais não cabem em inteiros

    }
}