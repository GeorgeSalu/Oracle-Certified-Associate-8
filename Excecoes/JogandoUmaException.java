class JogandoUmaException {
     void primeiro(){
        System.out.println("primeiro antes");
        this.segundo();
        System.out.println("primeiro depois");
    }

    void segundo() {
        String s = null;
        System.out.println("segundo antes");
        s.length();
        System.out.println("segundo depois");
    }
}