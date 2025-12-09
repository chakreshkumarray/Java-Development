package To_7_Challenge_89_95;

public class Ch_89_ConcatenateString {
    public static void main(String[] args) {

        System.out.println(concatenateString("CK"));
        System.out.println(concatenateString("Ck","AK"));
    }

    public static String concatenateString(String ... strs){
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str).append("");
        }
        return sb.toString();
    }
}
