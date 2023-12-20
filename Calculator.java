import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        //IncomeTaxCalc();
        MathCalculator();
    }

    static void IncomeTaxCalc(){
        Scanner sc = new Scanner(System.in);
        int income =  sc.nextInt();
        int tax;

        if(income < 500000){
           tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = (int) (income * 0.2);
        }
        else{
            tax = (int) (income * 0.3);
        }

        sc.close();

        System.out.println("Your tax is : " + tax);
    }

    static void MathCalculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);
        sc.close();

        switch(operator){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            default: System.out.println("Invalid operator");
        }
    }
}
