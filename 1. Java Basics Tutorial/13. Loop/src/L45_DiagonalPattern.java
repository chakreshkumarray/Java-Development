public class L45_DiagonalPattern {
    public static void main(String[] args) {

        // *
        //   *
        //     *
        //       *
        //         *
        //       *
        //     *
        //   *
        // *

        int n = 5;

        for (int i = 1; i < n * 2; i++) {

            int spaces = (i <= n) ? (i - 1) : (n * 2 - i - 1);

            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }

            System.out.println("*");
        }

    }
}
