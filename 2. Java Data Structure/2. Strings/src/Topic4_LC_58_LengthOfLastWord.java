public class Topic4_LC_58_LengthOfLastWord {
    public static void main(String[] args) {

        System.out.println(LastWord("Hello World"));
    }

    public static int LastWord(String s){
        int res = 0;
        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                res++;
            }else if (res > 0){
                return res;
            }
        }
        return res;
    }
}
