class X {
    private int x;

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }
}

class Y extends X {
    public void metodo(){
        this.x = 5; //nao compila: "x has private access in x"

        this.setX(10); //compila e altero o x herdado mas nao visivel
    }
}