class TestaLacos {
    public static void main(String [] args){

        int externo = 4;
        for(int i = 1;i < 10;i++){
            if(i * j == 25) break;
            System.out.println(i + " * "+ j+" = "+(i*j));
        }

        System.out.println();

        for(int j = 1;j < 10;j++){
            if(j == 8) break;
            if(j == 5) continue;
            System.out.println(j);
        }

        int i = 0;
        while(i < 10){
            i++;
            if(i == 5) break;
            System.out.println("i = "+i);
        }
        System.out.println("fora do while");

    }
}