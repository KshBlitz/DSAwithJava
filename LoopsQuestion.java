import java.util.*;

public class LoopsQuestion {
    public static void main(String[] args) {
        //UserBreak();
        PrimeNumber();
    }

    static void UserBreak(){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter your number: ");
            int n = sc.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }

    static void PrimeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your prime number: ");
        int n = sc.nextInt();
        sc.close();

        if(n==2){
            System.out.println("Is prime");
        }
        else{
            boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println("Number "+ n + " is prime number");
        }
        else{
            System.out.println("Number is not prime");
        }
        }
    }    
}
