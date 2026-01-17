class StarDimond{
    public static void main(String[] args){
        // Upperr Half
        for(int i = 1; i <= 5; i++){
            for(int s = 1; s <= 5 - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Half
        for(int i = 5 - 1; i >= 1; i--){
            for(int s = 5; s > i; s--){
                System.out.print(" ");
            }

            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}