public class L33_StarPattern {
    public static void main(String[] args) {

        /*

        Star Pattern Problem

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *

         */

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
