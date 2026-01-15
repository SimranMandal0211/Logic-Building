public class PrimeNum {
    public static void main(String[] args){
        int num = 2;

        while(num <= 100){
            int i = 2;
            boolean isPrime = true;
            
            while(i <= num/2){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
                i++;
            }


            if(isPrime == true){
                System.out.print(num+" ");
            }
            num++;
        }
    }
}
