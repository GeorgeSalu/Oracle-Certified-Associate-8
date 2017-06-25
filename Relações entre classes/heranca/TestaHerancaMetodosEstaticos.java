class W {
        static void metodo() {
        }
    }

class  Z extends W {
}

class Teste {
    public static void main(String[] args) {
        Z.metodo(); // melhor seria escrever W.metodo()
    }
}