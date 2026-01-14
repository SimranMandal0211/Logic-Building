import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number to check palindrome: ");
        int num = sc.nextInt();

        int digit = 0, originalNum = num, rev = 0;
        while(num > 0){
            digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        if(originalNum == rev){
            System.out.print(originalNum+" is Palindrome");
        }else{
            System.out.print(originalNum+" is not Palindrome");
        }
    }
}