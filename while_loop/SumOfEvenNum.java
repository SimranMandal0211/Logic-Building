import java.util.Scanner;

class SumOfEvenNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int i = 1, sumEven = 0;
        
        System.out.print("Sum of "+num+" even number = 0");
        while(i <= num){
            if(i % 2 == 0){
                sumEven += i;
                System.out.print(" + "+i);
            }
            i++;
        }

        System.out.print(" = "+sumEven);
    }
}