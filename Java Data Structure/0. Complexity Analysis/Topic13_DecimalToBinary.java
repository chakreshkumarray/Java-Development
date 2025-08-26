public class Topic13_DecimalToBinary {
    public static void main(String[] args) {

        System.out.println(decimalToBinary(19));
    }

    public static String decimalToBinary(int n){
        if (n == 0){
            return "0";
        }
        String  res = " ";
        while (n > 0){
            int rem = n % 2;
            n = n / 2;
            res = res + rem;
        }
        return new StringBuilder(res).reverse().toString();
    }
}
