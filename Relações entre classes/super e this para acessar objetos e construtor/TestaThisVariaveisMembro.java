class A{
    int i() { return 5; }
}
class Teste extends A{
    void roda() {
        System.out.println(this.i()); // imprime 5
    }
    public static void main(String [] args) {
        new Teste().roda();
    }
}
class Teste2 {
    int i() { return 5; }
    void roda() {
        System.out.println(this.i()); // imprime 5
    }
    public static void main(String [] args) {
        new Teste().roda();
    }
}