public class GreaterThan {
    public static void main(String[] args) {

        int a = 24;
        int b = 17;
        System.out.println(a > b);

        char c = 'K';
        char d = 'C';
        System.out.println('K'+0);
        System.out.println('C'+0);
        System.out.println(c > d);

        String str1 = "CKS";
        String str2 = "CKs";
        System.out.println(); // (str1>=str2); str1>=str2 not Use able in java this operator
        //solution
        System.out.println(str1.equals(str2)); // solution
    }
}
