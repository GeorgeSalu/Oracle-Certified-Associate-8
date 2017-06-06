class TestaIterator {
    public static void main(String[] args){

        Collection<String> strings = new ArrayList<String>();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String atual = iterator.next();
            System.out.println(atual);
        }

        //enhanced-for
        Collection<String> strings = new ArrayList<String>();
        for (String atual : strings) {
            System.out.println(atual);    
        }

    }
}