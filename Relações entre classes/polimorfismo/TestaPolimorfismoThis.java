class A{
    public void metodo() {
        System.out.println("a");
        this.metodo2();
    }
    public void metodo2() {
        System.out.println("metodo 2 do pai");
    }
}
class B extends A {
    public void metodo() {
        System.out.println("b");
        super.metodo();
    }
    public void metodo2() {
        System.out.println("c");
        metodo();
        super.metodo();
    }
    public static void main(String[] args) {
        new B().metodo2();
    }
}