public class Factorial {
    public static void main(String[] args) {
        //System.out.println(factorial(4));
        //System.out.println(BinCoef(5, 2));
        //System.out.println(sum(3,5));
        //System.out.println(sum(3, 40, 2));
        //System.out.println(isPrime(6));
        //PrimeinRange(10);
        //bintoDec(101);
        dectoBin(5);
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

    // public static boolean isPrime (int n){

    //     //corner case #1
    //     //2
    //     if(n==2){
    //         return true;
    //     }
        
    //     for(int i=2; i<=n-1; i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeinRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){ 
                System.out.println("Number " + i + " is a prime number");
            }

        }
    }

    public static void bintoDec(int binNum){
        int myNum = binNum;
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int lastDigit = binNum % 10; //to select last digit we modulo number by 10
            decNum=decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum / 10; //to remove last digit we divide number by 10
        }
        System.out.println("Decimal of  " + myNum +" = " + decNum);
    }

    public static int dectoBin(int decNum){
        int binNum = 0; 
        int pow = 0; 
        while (decNum != 0) { 
            int rem = decNum % 2; 
            binNum += rem * Math.pow(10, pow);
            decNum /= 2; 
  
            // Count used to store exponent value 
            pow++; 
        } 
  
        System.out.println(binNum); 
        return 0;
    }

}
