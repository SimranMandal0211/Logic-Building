import java.util.Scanner;
class Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number for table: ");
        int num = sc.nextInt();
        System.out.println();

        int i = 1;
        while(i <= 10){
            System.out.println(num+" X "+i+" = "+(num*i));
            i++;
        }
    }
}