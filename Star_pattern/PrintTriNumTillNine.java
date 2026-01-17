class PrintTriNumTillNine{
    public static void main(String[] args){
        int n = 7, count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count+" ");
                count++;
                if(count == 10){
                    count = 0;
                }
            }
            System.out.println();
        }
    }
}