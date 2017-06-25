class Veiculo {
    public void liga(){
        System.out.println("Veiculo esta sendo ligado");
    }
}

class Carro extends Veiculo {
    public void liga(){
        System.out.println("Carro esta sendo ligado")
    }
}

class TestaPolimorfismo{
    public static void main(String[] args){
        Veiculo v = new Veiculo();
        v.liga();
    }
}