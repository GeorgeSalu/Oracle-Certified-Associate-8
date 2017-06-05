import java.util.ArrayList;

class TestaArrayLista {
    public static void main(String [] args){

        //declaracao
        ArrayList<String> nomes = new ArrayList<String>();

        //adicionar itens
        nomes.add("certificacao");
        nomes.add("Java");

        //verificar a existencia de elemento na colecao
        System.out.println(nomes.contains("Java"));
        System.out.println(nomes.contains("C#"));

        //removendo elementos
        boolean removido = nomes.remove("Java");

        //verificando o tamanho da colecao
        System.out.println(nomes.size());

        //convertenco para um array
        Object[] nomesComoString = nomes.toArray();
        String[] nomes3 = nomes.toArray(new String[nomes.size()]);

        //adicionando uma colecao inteira em outra
        ArrayList<String> nomes2 = new ArrayList<String>();
        nomes2.add("certificao");
        nomes2.add("java");

        ArrayList<String> paises = new ArrayList<String>();
        paises.add("coreia");
        paises.add("brasil");

        ArrayList<String> tudo = new ArrayList<String>();
        tudo.addAll(nomes2);
        tudo.addAll(paises);

        //alterando elemento em determinada posicao
        // set -> serve para alterar o elemento em determinada posicao
        nomes.set(0,"certificacao");

        //posicao na colecao
        // indexOf e lastIndexOf retornam a primeira ou a ultima posicao que possui o elemento informado
        System.out.println(nomes.indexOf("cerficacao"));
        System.out.println(nomes.lastIndexOf("Java"));

    }
}