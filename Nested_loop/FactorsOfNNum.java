import java.util.Scanner;

class FactorsOfNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num ; i++){
            int count = 0;
            for(int j = 1; j<= i ; j++){
                if(i % j == 0){
                    count++;
                }
            }

            System.out.println(i+" -> "+count);
        }

        sc.close();
    }
}
