package BreakAndContinue;

public class Ch66_SumAll {
    public static void main(String[] args) {

        int[] arr = {-54,43,45,-32,-23,-65,-53,-25};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                continue;
            }
            sum = sum+arr[i];
        }
        System.out.println("sum of positve number: "+sum);
    }
}
