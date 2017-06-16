class TestaLacosRotulos2 {
    public static void main(String[] args) {

        for(int i = 0; i < 4; i++) {
            System.out.println("Estou antes do switch");
            mario:
            guilherme: switch(i) {
                case 0:
                case 1:
                    System.out.println("Caso " + i);
                    for(int j = 0; j < 3; j++) {
                        System.out.println(j);
                        if(j==1) break mario;
                    }
                case 2:
                    System.out.println("Estou em i = " + i);
                    continue;
                case 3:
                    System.out.println("Cheguei no 3");
                    break;
                default:
                    System.out.println("Estranho...");
                    break;
            } 
            System.out.println("Estou apos o switch");
        }
    }
}