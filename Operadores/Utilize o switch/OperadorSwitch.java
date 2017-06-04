class OperadorSwitch {
    public static void main(String [] args){
        int opcao = 2;
        final int variavel = 1;
        switch (opcao){
            case variavel:
                System.out.println("Primeira opcao");
                break;
            case 2:
            case 3:
                System.out.println("Terceira opcao");
            default:
                System.out.println("default");
        }
    }
}