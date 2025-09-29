package Methods;

public class Parameter {
    public static void main(String[] args) {

        int num = sum(12,13);
        System.out.println(num);

        System.out.println(sum(10,15));
    }

    public static int sum(int x,int y){
        int sum = x+y;
        return sum;
    }
}
