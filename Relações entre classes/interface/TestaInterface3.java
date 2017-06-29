// compila, todos os métodos implementados
class Carro implements Veiculo {
    public void ligar() {
    }
    public int pegaMarcha() {
        return 0;
    }
}
// não compila, onde está o pegaMarcha?
class Moto implements Veiculo {
    public void ligar() {
    }
}
// não compila, o método pegaMarcha definiu escopo default, 
// quando deveria definir public
class Triciclo implements Veiculo {
    public void ligar() {
    }
    int pegaMarcha() {
        return 0;
    }
}