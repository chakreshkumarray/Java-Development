public class Topic6_LC_1456_MaximumNumberVowelsSubStringLength {
    public static void main(String[] args) {

        System.out.println(MaxVowels("abciiidef",3));
    }

    public static int MaxVowels(String s, int k){
        int l = 0;
        int r = 0;
        int res = 0;
        int window = 0;

        for (; r < k; r++){
            window += isVowel(s.charAt(r));
        }
        res  = window;

        while (r < s.length()){
            window -= isVowel(s.charAt(l++));
            window += isVowel(s.charAt(r++));
            res = Math.max(res,window);
        }
        return res;
    }

    public static int isVowel(char c){
        return (c =='a' || c =='e' || c == 'i' || c == 'o' || c =='u') ? 1 : 0;
    }

}
