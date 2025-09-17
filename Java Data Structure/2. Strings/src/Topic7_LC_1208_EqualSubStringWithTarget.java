public class Topic7_LC_1208_EqualSubStringWithTarget {
    public static void main(String[] args) {

        System.out.println(EqualSubString("abcd","bcdf",3));
    }

    public static int EqualSubString(String s, String t, int maxCost){
        int n = s.length();
        int ans = -1;
        int window = 0;
        int left = 0;
        for (int right = 0; right <  n; right ++){
            window = window + Math.abs(s.charAt(right) -t.charAt(right));
            while (window > maxCost){
                window = window - Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            ans = Math.max(ans , right - left + 1);
        }
        return ans;
    }
}
