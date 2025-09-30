package Exception_Handling;

public class TryCatch {
    public static void main(String[] args) {

        int[] numerator = {10,200,30,40};
        int[] denominator = {1,2,0,4};
        for(int i=0;i<numerator.length;i++){
            System.out.println(divide(numerator[i],denominator[i]));
        }
        System.out.println("God job..");
    }

    public static int divide(int a ,int b){
        try {
            return a/b;
        }catch (ArithmeticException e){
            System.out.println(e);
            return -1;
        }
    }
}
