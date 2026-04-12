package Exception_Handling;

public class Topic9_ToString {
    public static void main(String[] args) {

        try {
            int a = 10 / 0; // Exception

        } catch (ArithmeticException e) {

            System.out.println("Using toString(): " + e.toString());
            System.out.println("Using getMessage(): " + e.getMessage());
            System.out.println("Using printStackTrace(): ");

            e.printStackTrace();
        }
    }
}
