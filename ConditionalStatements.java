import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        //IfElse();
        //LargestNo();
        //OddEven();
        //ElseIf();
        //Largestof3();
        //Ternary();
        //PassOrFail();
        Switch();
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

    static void Largestof3(){
        int a = 1, b = 2, c = 3;

        if( (a>=b) && (a>=c)){
            System.out.println("A is largest");
        }
        else if(b>=c){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }            
    }

    static void Ternary(){
        int number = 73;

        //ternary
        String type = ((number%2)==0)? "Even" : "Odd";
        System.out.println(type);
    }

    static void PassOrFail(){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String RC = (marks>=33) ? "Pass" : "Fail";
        System.out.println(RC);
        sc.close();
    }

    static void Switch(){
        int number = 2;
        switch(number){
            case 1 : System.out.println("PS4");
            break;
            case 2 : System.out.println("PS5");
            break;
            case 3 : System.out.println("Nintendo");
            break;
            case 4 : System.out.println("PC");
            break;
            default : System.out.println("Mobile Phone");
        }
    }

}  