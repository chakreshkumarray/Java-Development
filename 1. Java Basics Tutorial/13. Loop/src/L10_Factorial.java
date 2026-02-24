public class L10_Factorial {
    public static void main(String[] args) {

        System.out.println("with Function: "+Fact(5));

        System.out.println("with Recursion: "+fact(4));

        int n = 3;
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of number: "+fact);

    }

    public static int Fact(int num){

        // 5 * 4 * 3 * 2 * 1
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int fact(int num){
        if (num == 0){
            return 1;
        }
        return num * fact(num-1);
    }
}
