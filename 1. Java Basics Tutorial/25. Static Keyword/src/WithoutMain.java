public class WithoutMain {

    /*
    This code could have run before 1.6 jdk version
    we can create multiple static block in same class
    code will run from top to bottom
    first run static variable, method, blocks then main methods
     */
    static {
        System.out.println("Chakresh Kumar Ray");
    }

    public static void main(String[] args) {
        System.out.println("Ak ");
    }

    static {
        System.out.println("Ck Ray");
    }
}
/*
Use:
    static block is executed at class loading, hence at the time of class loading if we want to perform any activity,
    we have to define that inside static block
 */