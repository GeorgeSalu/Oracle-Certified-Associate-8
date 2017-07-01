class Pessoa {

    /**
        IllegalStateException
     */

    boolean dormindo = false;

    void dormir() {
        this.dormindo = true;
        System.out.println("dormindo...");
    }
    void acordar() {
        this.dormindo = false;
        System.out.println("acordando...");
    }
    void andar() {
        if(this.dormindo) { // Só pode andar acordado.
            throw new IllegalStateException("Deveria estar 
                                             acordado!"); 
        }

        System.out.println("andando...");
    }        
}