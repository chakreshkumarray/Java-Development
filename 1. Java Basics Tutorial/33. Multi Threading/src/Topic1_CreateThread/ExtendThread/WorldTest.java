package Topic1_CreateThread.ExtendThread;

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
