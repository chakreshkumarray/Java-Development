public class FinalKeyword {

    /*
    not update value or variable
    not override method
    not inherit same class, not able to extend class
     */
    public static void main(String[] args) {

        // int i = 10;
        final int i = 10;
        // i = i + 20;       --> error not able to update
        System.out.println(i);

    }

}