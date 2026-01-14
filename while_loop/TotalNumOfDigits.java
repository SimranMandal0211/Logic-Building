import java.util.Scanner;
class TotalNumOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        System.out.print("Total Digits in "+originalNum+" : "+count);
    }
}