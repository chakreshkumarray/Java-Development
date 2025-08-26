public class Topic18_LC_2894_DivisibleAndNonDivisibleSumsDifference {
    public static void main(String[] args) {

        System.out.println(SumAll(10,3));
    }

    public static int  SumAll(int n, int m){
        int x = n/m;
        int num2 = m * x * (x + 1 ) / 2;
        int num1 = n * (n+1) / 2 - num2;
        return num1 - num2;
    }
}
