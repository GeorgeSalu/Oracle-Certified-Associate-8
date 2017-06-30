class UsoTryCatch {
    public static void main(String[] args){
        String nome = null;
        try {
            nome.toLowerCase();
            System.out.println("segunda linha do try");
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("peguei");
        }
        System.out.println("continuando normal");
    }
}