package Ch85;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(12,13));
        System.out.println(add(2,4,6));
        System.out.println(add(1.3,2.5));
    }

    public static int add(int a, int b){
       return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static double add(double a, double b){
        return a + b;
    }

}
