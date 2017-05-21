class Calculadora {

    public int soma(int... nums){
        int total = 0;
        for(int a : nums){
            total += a;
        }
        return total;
    }

    public int soma2(int... numeros){
        int soma = 0;
        for(int i = 0;i < numeros.length; i++){
            soma += numeros[i];
        }
        return soma;
    }

}
class TestaCalculadora() {
    public static void main(String[] args){
        Calculadora c = new Calculadora();
        System.out.println(c.soma2());
        System.out.println(c.soma2(3));
        System.out.println(c.soma2(3,4));
    }
}