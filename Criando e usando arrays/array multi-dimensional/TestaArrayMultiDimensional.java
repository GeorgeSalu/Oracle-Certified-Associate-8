class TestaArrayMultiDimensional {
    public static void main(String [] args){

        int[][] tabela;
        int[][] cubo;
        int[][] hipercubo[][];

        tabela = new int[10][5];
        cubo = new int[10][][];

        int[][] estranho = new int[2][];
        estranho[0] = new int[20];
        estranho[1] = new int[10];

        for(int i = 0;i < estranho.length;i++){
            System.out.println(estranho[i].length);
        }

    }
}