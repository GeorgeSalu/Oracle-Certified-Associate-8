class JogandoUmaException2 {
    void primeiro(){
        try {
            System.out.println("primeiro antes");
            this.segundo();
            System.out.println("primeiro depois");
        } catch(IOException e) {
            // tratamento.
            System.out.println("primeiro catch");
        }
        System.out.println("primeiro fim");
    }

    void segundo() throws IOException {
        System.out.println("segundo antes");
        System.in.read(); // pode lançar IOException
        System.out.println("segundo depois");
    }
}