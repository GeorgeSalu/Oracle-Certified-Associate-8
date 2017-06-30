class JogandoUmaException5 {
    public static void main(String[] args) {
        try {
            metodo();
        } catch(RuntimeException ex) {
            System.out.println("Exception pega");
        }
        System.out.println("Apos a invocacao do metodo");
    }

    private static void metodo() {
        int[] i= new int[10];
        System.out.println(i[15]);
        System.out.println("Apos a exception");
    }
}