package Raja_Software;

public class Code_3 {
    public static void main(String[] args) {

        String num1 = "123";
        String num2 = "456";
        if (num1.equals("0")|| num2.equals("0")){
            System.out.println("0");
            return;
        }
        int n1 = num1.length();
        int n2 = num2.length();

        int[] pos = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + pos[i + j + 1];

                pos[i + j + 1] = sum % 10; // Unit digit
                pos[i + j] += sum / 10;    // Carry
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int p : pos) {
            if (!(sb.length() == 0 && p == 0)) sb.append(p);
        }

        System.out.println(sb.toString());
    }
}
