package PassBy;

public class Value {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = sum(a,b);
        System.out.printf("a=%d, b=%d, sum=%d",a,b,sum);
    }

    public static int sum(int a , int b){
        return a+b;
    }
}
