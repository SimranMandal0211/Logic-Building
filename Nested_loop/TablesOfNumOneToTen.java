class TablesOfNumOneToTen{
    public static void main(String[] args){

        System.out.print("Tables of 1 to 10\n");

        for(int i = 1; i <= 10; i++){
            System.out.println(".....Table of "+i+" .....");
            for(int j = 1; j <= 10; j++){
                System.out.println(i+" X "+j+" = "+(i*j));
            }
        }
    }
}