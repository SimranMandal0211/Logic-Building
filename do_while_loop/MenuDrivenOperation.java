import java.util.Scanner;

public class MenuDrivenOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ch;
        do { 
            System.out.println("......Menu.....");
            System.out.println("1. Addition ");      
            System.out.println("2. Substraction ");      
            System.out.println("3. Multiplication ");    
            System.out.println("4. Division ");
            System.out.println("5. Exit ");
                
            System.out.print("Enter your Choice ");
            ch = sc.nextInt();

            switch(ch){
                case 1: System.out.print("Addition of "+a+" + "+b+" : "+(a+b)+"\n");
                    break;
                case 2: System.out.print("Subtraction of "+a+" - "+b+" : "+(a-b)+"\n");
                    break;
                case 3: System.out.print("Multiplication of "+a+" X "+b+" : "+(a*b)+"\n");
                    break;
                case 4: System.out.print("Division of "+a+" / "+b+" : "+(a/b)+"\n");
                    break;
                case 5: System.out.print("Exiting....\n");
                    break;
                default: System.out.print("Invalid Choice");
            }
        } while (ch != 5);

        sc.close();
    }
}
