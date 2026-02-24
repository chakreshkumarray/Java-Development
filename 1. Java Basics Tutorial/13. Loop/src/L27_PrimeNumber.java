public class L27_PrimeNumber {
    public static void main(String[] args) {

        System.out.println(isPrime(11));
        System.out.println(isPrime(12));
        System.out.println(isPrime(23));

        // 1 to 100
        int temp = 0;
        int num = 101;
        for (int i = 1; i <= num; i++){

            for (int j = 2; j < i; j++){
                if ( i % j == 0){
                    temp = temp + 1;
                }
            }
            if (temp == 0){
                System.out.println(i);
            }else {
                temp = 0;
            }
        }
    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

}
