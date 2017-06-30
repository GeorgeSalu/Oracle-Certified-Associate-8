class JogandoUmaException3 {
    void primeiro(){
        try {
            this.segundo();
        } catch (RuntimeException e) {
            // tratamento.
        }
    }

    void segundo() {
        throw new RuntimeException();
    }
}