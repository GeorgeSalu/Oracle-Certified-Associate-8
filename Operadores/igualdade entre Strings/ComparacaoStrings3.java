class ComparacaoStrings3 {
    public static void main(String [] args){
        String texto = "um texto qualquer";
        String txt = texto.substring(3,8);

        System.out.println(txt == "texto");
        System.out.println(texto.toLowerCase() == texto);
        System.out.println(texto.toString() == texto);

    }
}