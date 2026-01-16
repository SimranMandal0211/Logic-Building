import java.util.Scanner;
class GeometricProgession{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number ");
        int num = sc.nextInt();

        int sum = 0, sq = 1;
        for(int i = 1; i <= num; i++){
           System.out.print("("+i+" * "+i+") + ");

           sum += (i*i);
        }
        System.out.println("Geometric Progression "+sum);
    }
}