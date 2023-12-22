import java.util.*;
public class Loops {
    public static void main(String[] args) {
        //Counter();
        //SumNatural();
        //For();
        SqPattern();
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
     
}
