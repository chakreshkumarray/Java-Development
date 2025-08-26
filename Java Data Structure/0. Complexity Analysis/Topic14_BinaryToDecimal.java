public class Topic14_BinaryToDecimal {
    public static void main(String[] args) {

        System.out.println(binaryToDecimal("101"));
    }

    public static int binaryToDecimal(String bin){

        int length = bin.length();
        int m = 1;
        int res = 0;
        for (int i = length -1; i >= 0; i--){
            char lastChar = bin.charAt(i);
            Integer lastBit = Integer.valueOf(String.valueOf(lastChar));
            res = res + m * lastBit;
            m = m * 2;
        }
        return res;
    }
}
