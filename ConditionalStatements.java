import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        //IfElse();
        //LargestNo();
        //OddEven();
        ElseIf();

    }

    static void IfElse(){
        int age = 14;

        if(age >= 18){
            System.out.println("adult");
        }

        if(age > 13 && age < 18){
            System.out.println("teen");
        }
        else{
            System.out.println("not adult");
        }
    }

    static void LargestNo(){
        int a = 1;
        int b = 5;

        if(a>b){
            System.out.println("A is large");
        }
        else{
            System.out.println("B is larger");
        }
    }

    static void OddEven(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }

//Saves computation time
    static void ElseIf(){
        int age = 14;

        if(age >= 18){
            System.out.println("adult");
        }

        else if(age > 13 && age < 18){
            System.out.println("teen");
        }
        else{
            System.out.println("not adult");
        }
    }


}            