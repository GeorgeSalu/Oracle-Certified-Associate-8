class JogandoUmaException4 {
    public static void main(String[] args) {
        metodo();
        System.out.println("Apos a invocacao do metodo");
    }

    private static void metodo() {
        int[] i= new int[10];
        System.out.println(i[15]);
        System.out.println("Apos a exception");
    }
}