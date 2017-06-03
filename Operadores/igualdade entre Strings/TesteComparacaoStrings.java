class TesteComparacaoStrings {
    public static void main(String []args){

        String nome1 = "Java";
        String nome2 = "Java";

        String nome3 = new String("Java");

        System.out.println(nome1 == nome2);
        System.out.println(nome1 == nome3);
        System.out.println(nome1.equals(nome3));

    }
}