public class SignatureUpperCase {
    public static void main(String[] args) {

        String name ="chakresh";
        System.out.println(upperCase(name));
        System.out.println(name);
    }

      /* Signature means -> method name same , return type different ,
       parameters are same , but parameters return type different,
       parameter list different .
     */

    public static String upperCase(String str){
        return str.toUpperCase();
    }
}
