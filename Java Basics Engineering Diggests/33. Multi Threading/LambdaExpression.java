package LAMDA_Expression_12;

public class LambdaExpression {
    public static void main(String[] args) {

        // Old Override or interface , method .
        Runnable runnable = new Runnable (){
            @Override
            public void run(){
                System.out.println("Interface.");
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();


        // Lambda Expression
        Runnable runnable1 = () -> System.out.println("Lambda.");
        runnable1.run();

        // Second Method
        Thread t2 = new Thread(() -> System.out.println("ck"));
        t2.start();
    }
}
