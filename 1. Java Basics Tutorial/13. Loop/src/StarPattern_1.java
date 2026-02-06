public class StarPattern_1 {
    public static void main(String[] args) {

        /*
        Print this Pattern - 1
        *
        * *
        * * *
        * * * *

         */

        for(int i = 1; i <= 4; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        Print this Pattern - 2
        * * * *
        * * *
        * *
        *

         */

        for (int i = 1; i <= 4; i++){
            for (int j = 4; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
