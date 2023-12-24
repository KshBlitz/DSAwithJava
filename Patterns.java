public class Patterns {
    public static void main(String[] args) {
        //Star();
        //InvertedStar();
        //HalfPyramid();
        //InvertedPyramid();
        CharPattern();
    }

    static void Star(){
        for(int line = 1; line<=4; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void InvertedStar(){
        for(int line = 1; line<=4; line++){
            for(int star=1; star<=4- line +1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void HalfPyramid(){
        int n =4;
        for(int line =1; line<=n; line++){
            for (int number=1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }

    static void InvertedPyramid(){
        int n = 4;
        for(int line =1; line<=n; line++){
            for (int number=1; number<=n-line+1; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }

    static void CharPattern(){
        int n =4;
        char ch ='A';

        for(int line = 1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

