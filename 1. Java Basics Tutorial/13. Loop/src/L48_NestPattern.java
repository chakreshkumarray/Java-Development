public class L48_NestPattern {
    public static void main(String[] args) {

        /*
                     *
                   *   *
                 *       *
               *           *
             *               *
               *           *
                 *       *
                   *   *
                     *

         */

        int n = 5;

        for (int i = -n + 1; i < n; i++) {

            int absI = Math.abs(i);
            int row = n - absI;

            for (int j = 0; j < 2 * absI; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (row > 1) {
                for (int j = 0; j < 4 * (row - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
