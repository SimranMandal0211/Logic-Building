class BackCountTriangle{
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            for(int s = 1;  s <= 5 - i; s++){
                System.out.print(" ");
            }

            for(int j = 5; j >= 5 - i +1; j--){
                System.out.print(j);
            }

            for(int k = 5 - i + 2; k <= 5; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}