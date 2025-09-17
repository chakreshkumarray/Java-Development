public class Topic10_LC_383_RansomNote {
    public static void main(String[] args) {

        System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct("aa","aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine){
        int[] arr = new int[26];
        for (char r : ransomNote.toCharArray()){
            arr[r - 'a']++;
        }
        for (char r : magazine.toCharArray()){
            arr[r - 'a']--;
        }
        for (int i : arr){
            if (i > 0){
                return false;
            }
        }
        return true;
    }
}
