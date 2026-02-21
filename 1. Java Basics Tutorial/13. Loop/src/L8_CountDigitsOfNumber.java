public class L8_CountDigitsOfNumber {
    public static void main(String[] args) {

        // number is 45892383
        // find digits

        int n = 46845;
        int result = 0;
        while (n > 0){
            n = n / 10;
            result++;
        }
        System.out.println(result);

    }
}
