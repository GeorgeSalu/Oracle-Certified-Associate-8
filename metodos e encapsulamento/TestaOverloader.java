class Overloader {
    public void metodo2(String s){
        System.out.println("Com String");
    }
    public void metodo2(Object s){
        System.out.println("Com Object");
    }
    public void metodo3(String a,int b){
        System.out.println("String,Int");
    }
    public void metodo3(int b,String a){
        System.out.println("Int ,String");
    }
    public void metodo(int a){
        System.out.println("com int");
    }
    public void metodo(double a){
        System.out.println("com double");
    }
    public void metodo(){
        System.out.println("sem nada");
    }
}

class TestaOverloader {
    public static void main(String [] args){
        new Overloader().metodo2("guilherme");
        new Overloader().metodo2((Object) "guilherme");
        new Overloader().metodo2(new Object());

        new Overloader().metodo();
        new Overloader().metodo((short) 123);
        new Overloader().metodo(423);
        new Overloader().metodo((float) 123);
        new Overloader().metodo(342.3);
    }
}