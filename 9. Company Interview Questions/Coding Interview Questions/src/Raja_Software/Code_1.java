package Raja_Software;

import java.util.Arrays;

public class Code_1 {
    public static void main(String[] args) {
        int[] num = {100,4,200,1,3,2};
        Arrays.sort(num);
        int max = 1;
        int current = 1;
        for (int i = 0; i < num.length-1; i++){
            if (num[i + 1] == num[i] + 1){
                current++;
            } else if (num[i+1] == num[i]) {
                continue;
            }else {
                current = 1;
            }
            if (current > max){
                max = current;
            }
        }
        System.out.println(max);
    }
}
