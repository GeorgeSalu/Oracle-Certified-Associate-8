abstract class Veiculo {
    public abstract void liga();
}

// compila pois implementou
class Moto extends Veiculo {
    public void liga() {

    }    
}

// compila pois a classe é abstrata, com método herdado 
// abstrato ainda
abstract class QuatroRodas extends Veiculo {
}

// não compila pois a classe não é abstrata, 
// com método herdado abstrato ainda
class SemRodas extends Veiculo {
}