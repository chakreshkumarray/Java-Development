public class CountDigitsOfNumber {
    public static void main(String[] args) {

        // number is 45892383
        // find digits

        int n=46892245;
        int result=0;
        while (n>0){
            n=n/10;
            result++;
        }
        System.out.println(result);
    }
}
