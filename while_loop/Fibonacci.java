import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number ");
        int num = sc.nextInt();

        int a=0, b=1, i=1;

        System.out.println("Fabonacci Series");

        int sum = 0;
        while(i <= num){
            System.out.print(a+" ");
            
            int next = a + b;
            a = b;
            b = next;

            sum += a;

            i++;
        }

        System.out.println("Sum of Fabonacci numbers: "+sum);
    }
}
