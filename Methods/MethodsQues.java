import java.util.*;

public class MethodsQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(Average(a, b, c));
        sc.close();
    }

    public static double Average(double a, double b, double c){
        return (a+b+c)/3;
    }
}
