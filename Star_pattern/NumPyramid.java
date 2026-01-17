class NumPyramid{
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i <= n; i++){
            // space
            for(int s = 1; s <= n-i; s++){
                System.out.print(" ");
            }
            // Ascending 
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            // Decending
            for(int j = i-1; j >= 1; j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}