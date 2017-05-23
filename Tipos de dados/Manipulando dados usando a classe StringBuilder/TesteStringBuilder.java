class TesteStringBuilder {
    public static void main(String args[]){

        StringBuilder sb = new StringBuilder();
        sb.append("Caelum");
        sb.append(" - ");
        sb.append("Ensino e Inovacao");

        //caelum - Ensino e inovacao
        System.out.println(sb);

        //vazio
        StringBuilder sb1 = new StringBuilder();
        //conteudo inicial
        StringBuilder sb2 = new StringBuilder("java");
        //tamanho inicial do array para colocar a string
        StringBuilder sb3 = new StringBuilder(50);
        //baseado em outro objeto do mesmo tipo
        StringBuilder sb4 = new StringBuilder(sb2)

    }
}