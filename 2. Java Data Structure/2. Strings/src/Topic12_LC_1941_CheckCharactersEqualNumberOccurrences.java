public class Topic12_LC_1941_CheckCharactersEqualNumberOccurrences {
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abacbc"));
        System.out.println(areOccurrencesEqual("aaabb"));
    }

    public static boolean areOccurrencesEqual(String s){
        int[] count = new int[26];

        for (char c : s.toCharArray()){
            count[c - 'a']++;
        }

        int x = 0;

        for (int i : count){
            if (i != 0 && x == 0){
                x = i;
            }else if (i != 0){
                if (x != i){
                    return false;
                }
            }
        }
        return true;
    }

}
