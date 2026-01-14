import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number ");
        int num = sc.nextInt();

        int i = 1, fact = 1; 
        System.out.print("Factorial of "+num+" :");
        while(i <= num){
            fact *= i;
            System.out.print(" X "+i);
            i++;
        }
        System.out.print(" : "+fact);
    }
}