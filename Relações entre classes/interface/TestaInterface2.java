abstract class Veiculo {
    public abstract void liga();
}

abstract class Moto extends Veiculo {

}

class MotoEspecial extends Moto {
    public void liga() {

    }    
}

// compila: decidi implementar mas mesmo assim
// manter a classe abstrata
abstract class QuatroRodar extends Veiculo {
    public void liga() {
    }
}