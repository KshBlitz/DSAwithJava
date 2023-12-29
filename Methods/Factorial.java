public class Factorial {
    public static void main(String[] args) {
        //System.out.println(factorial(4));
        //System.out.println(BinCoef(5, 2));
        //System.out.println(sum(3,5));
        //System.out.println(sum(3, 40, 2));
        System.out.println(isPrime(5));
    }

    public static int factorial(int n){
        int f = 1;

        for(int i=1; i<=n; i++){
            f = f* i;
        }

        return f;
    }

    public static int BinCoef(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static boolean isPrime (int n){

        //corner case #1
        //2
        if(n==2){
            return true;
        }
        
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
