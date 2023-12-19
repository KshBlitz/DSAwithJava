public class Operators {
    public static void main(String[] args) {
      //UnaryIncrement(); 
      //UnaryDecrement(); 
      //RelationalOperator();
      //LogicalOperator();
      AssignmentOperator();
    }

    static void UnaryIncrement(){
        int a = 10;
        int b = ++a;

        System.out.println(a); 
        System.out.println(b); 
    }
    static void UnaryDecrement(){
        int a = 10;
        int b = --a;
        int c = a--;

        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
    }

    static void RelationalOperator(){
        int a = 19;
        int b = 19;

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
    }

    static void LogicalOperator(){
        System.out.println((3>2) && (5<0));
        System.out.println(!(3==0));
    }

    static void AssignmentOperator(){
        int a = 10;
        //a = a+10;
        a += 10; //this increases execution speed
        int b = 15;
        //b = b - 5;
        b -= 5;
        System.out.println(a);
        System.out.println(b);
    }
}
