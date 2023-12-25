import java.util.*;

public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalcSum(a, b);
        System.out.println(sum);
    }

    public static int CalcSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
