import java.util.Scanner;

class ProductOfAllDigitInNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number ");
        int num = sc.nextInt();

        int rem = 1, prod = 1;

        System.out.print("Product of "+num+"'s digits ");
        while( num > 0 ){
            rem = num % 10;
            prod *= rem;
            num = num/10;
            System.out.print(rem+" X ");
        }

        System.out.print("= "+prod);
    }
}