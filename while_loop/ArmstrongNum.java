import java.util.Scanner;
class ArmstrongNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number ");
        int num = sc.nextInt();

        int rem = 0, ArmstrongSum = 0, originalNum = num;

        while(num > 0){
            rem = num % 10;
            ArmstrongSum += (rem*rem*rem);
            num = num / 10;
        }

        System.out.println("Armstrong number: "+ArmstrongSum);

        if(ArmstrongSum == originalNum){
            System.out.print(originalNum+" is Armstrong number");
        }else{
            System.out.print(originalNum+" is not Armstrong number");
        }
    }
}