package CompileTime;

public class Calculate {
    public static void main(String[] args) {
        System.out.println(Sum(15,20));
        System.out.println(Sum(11,24,12));
        System.out.println(Sum(1.5f,2.3f));
    }
    /*
    Compile Time Polymorphism achieved by Method Over Loading
     */

    public static int Sum(int a , int b){
        return a+b;
    }

    public static int Sum(int a ,int b,int c){
        return a+b+c;
    }

    public static double Sum(float a , float b){
        return a+b;
    }
}
