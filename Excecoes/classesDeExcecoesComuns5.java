class classesDeExcecoesComuns5 {
    public static void main(String[] args) {
        try {
            divideEImprime(5,0);
        } catch (IllegalArgumentException e) {
            // tratamento.
        }
    }

    public static void divideEImprime(int i, int j) {
        if(j == 0) { // Evita dividir por zero.
            throw new IllegalArgumentException();
        }
        System.out.println(i/j);
    }
}