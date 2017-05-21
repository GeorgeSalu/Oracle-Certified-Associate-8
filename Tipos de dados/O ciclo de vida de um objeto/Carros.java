import java.util.*;
class Carro {

}
class Carros {
    List<Carro> carros = new ArrayList<Carro>();
}
class Teste {
    public static void main(String args[]){
        Carro carros = new Carros();
        for(int i = 0;i < 100;i++){
            carros.carros.add(new Carro());
        }
    }
}