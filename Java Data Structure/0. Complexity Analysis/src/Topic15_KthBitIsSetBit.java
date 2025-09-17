public class Topic15_KthBitIsSetBit {
    public static void main(String[] args) {

        int n = 55;
        int k = 3;
        System.out.println((n >> (k-1) & 1) == 1);
    }
}
