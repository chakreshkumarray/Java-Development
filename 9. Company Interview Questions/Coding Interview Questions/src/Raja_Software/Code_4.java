package Raja_Software;

public class Code_4 {
    public static void main(String[] args) {

        String str = "0110101";
        char[] arr = str.toCharArray();
        int seconds = 0;
        boolean changed = true;

        while (changed) {
            changed = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == '0' && arr[i + 1] == '1') {
                    arr[i] = '1';
                    arr[i + 1] = '0';
                    changed = true;
                    i++;
                }
            }
            if (changed) {
                seconds++;
            }
        }
        System.out.println(seconds);
    }
}
