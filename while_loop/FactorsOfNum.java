import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to get factors: ");
        int num = sc.nextInt();

        int i = 1;

        while(i <= num){
            if(num % i == 0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
