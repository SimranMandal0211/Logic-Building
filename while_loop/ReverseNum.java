import java.util.Scanner;
class ReverseNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int rev = 0, rem = 1, originalNum;
        originalNum = num;

        while(num > 0 ){
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num/10;
        }
        System.out.print("Reverse of "+originalNum+" : "+rev);
    }
}