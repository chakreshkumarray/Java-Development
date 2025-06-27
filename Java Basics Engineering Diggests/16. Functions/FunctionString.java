public class FunctionString {
    public static void main(String[] args) {

        String a = "ak ,pk,ck,dk,ak  ";
        System.out.println(StringCase(a));
    }

    public static String StringCase(String str){

        return str.trim().toUpperCase();
    }
}
