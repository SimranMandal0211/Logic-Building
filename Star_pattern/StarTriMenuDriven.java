import java.util.Scanner;
class StarTriMenuDriven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ch;
        do{
            System.out.println("-----Star Menu Driven-----");
            System.out.println("1. Left Upper Triangle \n2. Right Upper Triangle \n3. Left Lower Triangle \n4. Right Lower Triangle \n5. Exit...");
            System.out.print("Enter your choice ");
             ch = sc.nextInt();

            switch(ch){
                case 1: System.out.println("Left Upper Traingle");
                    for(int i = 1; i <= 5; i++){
                        for(int j = 5; j >= i; j--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2: System.out.println("Right Upper Triangle");
                    for(int i = 1; i <= 5; i++){
                        for(int s = 1; s <= i; s++){
                            System.out.print(" ");
                        }
                        for(int j = 5 ; j >= i ; j--){
                            System.out.print("*");
                        }
                        System.out.println();
                        
                    }
                    break;

                case 3: System.out.println("Left Lower Triangle");
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4: System.out.println("Right Lower Triangle");
                    for(int i = 1; i <= 5; i++){
                        for(int s = 1; s <= 5 - i; s++){
                            System.out.print(" ");
                        }

                        for(int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5: System.out.println("Exit...");
                    break;
                default: System.out.println("Wrong Option!!!");
            }

        }while(ch == 5);

    }
}