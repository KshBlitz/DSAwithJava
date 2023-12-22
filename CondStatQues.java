import java.util.Scanner;

public class CondStatQues {
    public static void main(String[] args) {
        //PositiveOrNegative();
        //Temp();
        //WeekDay();
        //XYValue();
        LeapYear();
    }

    static void  PositiveOrNegative(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        String RC = (number>=0) ? "Positive" : "Negative";
        System.out.println(RC);
        sc.close();
    }

    static void Temp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        double temp = sc.nextDouble();

        String RC = (temp>100)? "You have fever" : "You don't have fever";
        System.out.println(RC);
        sc.close();
    }

    static void WeekDay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week number: ");
        int number = sc.nextInt();

        switch(number){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;
            default : System.out.println("Invalid week number");
        }
        sc.close();
    }

    static void XYValue(){
        int a = 63, b = 36;
        boolean x = (a<b)? true : false;
        int y = (a>b) ? a : b;
        System.out.println(x);
        System.out.println(y);
    }

    static void LeapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 ==0){
                if(year % 400 == 0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }

}

