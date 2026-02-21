public class L10_Factorial {
    public static void main(String[] args) {

        System.out.println(Fact(5));
    }

    public static int Fact(int num){

        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
}
