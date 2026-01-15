import java.util.Scanner;

public class SumOfEnterNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num, sum = 0, lg = 0;
        do{
        num = sc.nextInt();
            sum += num;

            if(lg < num){
                lg = num;
            }
        }while(num != 0);

        System.out.print("Sum of all number "+sum);
        System.out.println("Largest of all number "+lg);
        

    }
}
