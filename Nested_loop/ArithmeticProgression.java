import java.util.Scanner;
class ArithmeticProgression{
    // An = a + (n-1)d,  d = a2 - a1

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of term: ");
        int term = sc.nextInt();

        System.out.print("Enter first number ");
        int a1 = sc.nextInt();

        System.out.print("Enter common difference ");
        int d = sc.nextInt();

        int an = a1;
        for(int i = 1; i <= term; i++){
            System.out.print(an+" ");
            an = an + d;
        }

        sc.close();
    }
}