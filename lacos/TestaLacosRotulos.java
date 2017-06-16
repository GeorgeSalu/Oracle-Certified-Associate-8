class TestaLacosRotulos {
    public static void main(String [] args){


        /**
            labels statements
         */
        externo: for(int i = 1;i < 10;i++){
            interno: for(int j = 1;j < 10;j++ ){
                if(i * j == 25){
                    break externo;
                }
                if(i * j == 16){
                    continue interno;
                }
            }
        } 

    }
}