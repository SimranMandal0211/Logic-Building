import java.util.Scanner;

public class SmallAndLargeDigitInNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number ");
        int num = sc.nextInt();

        int originalNum = num;
        int sm = 9, lg = 0 , rem = 0;
        while (num > 0) { 
            rem = num % 10;

            if(rem < sm){
                sm = rem;
            }
            if(rem > lg){
                lg = rem;
            }
            
            num = num / 10;
        }

        System.out.print("Largest digit is "+lg+" and smallest digit is "+sm+" in number "+originalNum);
    }
}
