public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println(sum(15,20));
        System.out.println(sum(14,13,17));

    }

    /* Overloading means -> method name same , return type same ,
       but parameters are different
     */

    public static int sum(int a ,int b){
        return a+b;
    }

    public static int sum(int a , int b , int c){
        return a+b+c;
    }
}
