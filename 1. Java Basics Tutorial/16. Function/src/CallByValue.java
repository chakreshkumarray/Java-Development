public class CallByValue {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        System.out.println("Before function call value: x = " +x+" , y = " + y);

        CallByValue(x,y);
        System.out.println("After function call value: x = " +x+" , y = " + y);
    }

    // no change on console
    public static void CallByValue(int a , int b){
        int temp = a;
        a = b;
        b = temp;

    }
}
