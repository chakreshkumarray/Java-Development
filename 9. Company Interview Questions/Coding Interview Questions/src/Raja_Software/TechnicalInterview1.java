package Raja_Software;

public class TechnicalInterview1 {
    public static void main(String[] args) {
        //  nearest prime number of 32
        System.out.println(findNearest(30));

    }

    public static boolean prime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

     public static int findNearest(int n) {
         if (prime(n)) {
             return n;
         }
         for (int i = 1; ; i++) {
             if (prime(n - i)) {
                 return n - i;
             }
             if (prime(n + i)) {
                 return n + i;
             }
         }
     }
}
