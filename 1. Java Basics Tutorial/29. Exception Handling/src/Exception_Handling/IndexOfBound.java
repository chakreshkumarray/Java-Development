package Exception_Handling;

public class IndexOfBound {
    public static void main(String[] args) {
        int[] numerator = {10,200,30,40};
        int[] denominator = {1,2,0,4};
        for(int i = 0; i < 10; i++){
            try {
                System.out.println(divide(numerator[i],denominator[i]));
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("God job..");
    }

    public static int divide(int a, int b){
        try {
            return a/b;
        }catch (Exception e){
            return -1;
        }
    }
}
