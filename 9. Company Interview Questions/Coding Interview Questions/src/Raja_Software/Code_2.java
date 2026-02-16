package Raja_Software;

public class Code_2 {
    public static void main(String[] args) {

        int[] num = {4,1,2,1,2};
        int result = 0;
        for (int i = 0; i < num.length; i++){
            result = result ^ num[i];
        }
        System.out.println(result);
    }
}
