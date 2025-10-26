package To_1_VariableArgument;

public class VariableArgument {
    public static void main(String... args) {
        System.out.println("Hello Ck!");
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,2));
    }

    public static int sum(int a, int b){
        return  a + b;
    }

    public static int sum(int...a){
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        return sum;
    }
}