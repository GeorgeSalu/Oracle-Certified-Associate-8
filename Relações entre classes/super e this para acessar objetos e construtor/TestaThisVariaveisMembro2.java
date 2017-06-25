class Veiculo {
    double velocidade = 30;
}
class Carro extends Veiculo {
    double velocidade = 50;
    void imprime() {
        System.out.println(velocidade); // 1000
        System.out.println(this.velocidade); // 1000
        System.out.println(super.velocidade); // 30
    }
}
class Teste {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.velocidade = 1000;
        c.imprime();
    }
}