public class FunctionSignature {
    public static void main(String[] args) {

        System.out.println( sum(15,20));
        System.out.println(sum(1.5f,2.5f));

        System.out.println(sum("Ambreesh","Chakresh"));
    }

    /* Signature means -> method name same , return type different ,
       parameters are same , but parameters return type different,
       parameter list different .
     */

    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a , float b){
        return a+b;
    }

    public static String sum(String myName,String CkName){
        return myName+CkName;
    }

}
