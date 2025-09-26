public class Factorial {
    public static void main(String[] args) {

        System.out.println(Fact(5));
    }

    public static int Fact(int num){

        int result = 1;
        for (int i = 1; i <= num; i++){
            result = result * i;
        }
        return result;
    }
}
