import java.util.*;

public class LoopsQuestion {
    public static void main(String[] args) {
        //UserBreak();
        //PrimeNumber();
        //Factorial();
        //SumQues();
        MultiplicationTable();
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
    
    static void SumQues(){
        Scanner sc = new Scanner(System.in);
        
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do{
            System.out.println("Enter your number: ");
            number = sc.nextInt();
            if(number%2==0){
                evenSum = evenSum + number;
            }
            else{
                oddSum = oddSum + number;
            }
            System.out.println("Enter 1 to continue or 0 to quit: ");
            choice = sc.nextInt();
        } 
        while(choice == 1);

        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
        
    }

    static void Factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int fact = 1;
        
        for(int i = 1; i<=num; i++){
            fact = fact*i;
        }  
        System.out.println(fact); 
    }

    static void MultiplicationTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int X = num ;

        System.out.println("Here is the multiplication table of " + num);

        for(int i = 0; i<=9; i++){
            System.out.println(X);
            X += num ;
        }
    }
}    
