class CertificacaoString {

    public static void main(String args[]){
        
        //iniciando string
        String nomeDireto = "Java";
        String nomeIndireto = new String("Java");

        char[] nome = new char[]{'J','a','v','a'};
        String nomeComArray = new String(nome);

        StringBuilder sb1 = new StringBuilder("Java");
        String nome1 = new String(sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        String nome2 = new String(sb2);

        //strings sao imutaveis
        String s = "caelum";
        s.toUpperCase();
        System.out.println(s);

        

    }

}