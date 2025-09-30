package How_Create_Threads_1.Method_1;

public class WorldTest {
    public static void main(String[] args) {
        World world = new World();
        world.start();

        for (; ;){
            System.out.println("Hello");

          //  System.out.println(Thread.currentThread().getName());
        }


    }
}
