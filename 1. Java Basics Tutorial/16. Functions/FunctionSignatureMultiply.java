public class FunctionSignatureMultiply {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(multiplyBy10(10));
        System.out.println(x);
    }

     /* Signature means -> method name same , return type different ,
       parameters are same , but parameters return type different,
       parameter list different .
     */
     public static int multiplyBy10(int x) {
         return x*10;
     }

}
