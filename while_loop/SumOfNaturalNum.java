import java.util.Scanner;

class SumOfNaturalNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Natural Number: ");
        int num = sc.nextInt();

        int i = 1, sumNatural = 0;
        while(i<=num){
            sumNatural += i;
            i++;
        }
        System.out.print("Sum of "+num+" Natural numbers "+sumNatural);
    }
}