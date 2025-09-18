package Exception_Handling;

public class StackTrace {
    public static void main(String[] args) {
        /*level1();
        // solution
       try {
            level1();
       }catch (Exception e){
            System.out.println(e);
       }

        try {
            level1();
        }catch (Exception o){
             StackTraceElement[] stackTrace= o.getStackTrace();
             for (int i=0;i<stackTrace.length;i++){
                 System.out.println(stackTrace[i]);
             }
        }
        */

        try {
            level1();
        }catch (Exception o){
            o.printStackTrace();
        }
    }

    public static void level3(){
        int[] array = new int[5];
        array[5] = 10;

    }
    public static void levl2(){
        level3();
    }
    public static void level1(){
        levl2();
    }

}
