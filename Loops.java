import java.util.*;
public class Loops {
    public static void main(String[] args) {
        //Counter();
        //SumNatural();
        //For();
        //SqPattern();
        //Reverse();
        //Rev2();
        DoWhileLoop();
    }

    static void Counter(){
        int counter = 0;
        while(counter < 10){
            counter++;
            System.out.println(counter);
        }
    }

    static void SumNatural(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        sc.close();

        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    static void For(){
        for(int i=1; i<=10; i++){
            System.out.println("Hey");
        }
    }

    static void SqPattern(){
         for(int line = 1; line <=4; line++){
            System.out.println("****");
         }
    }  
    
    static void Reverse(){
        int n = 1;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
    }

    static void Rev2(){
        int n = 10899;
        int rev = 0;

        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }

    static void DoWhileLoop(){

    int i = 0;
        do{
            System.out.println("Will this go on forever");
            i++;
        }while(i<4);
    }
}
