package StringBuilder;
public class Ch75_ArrayToString {


    public static void main(String[] args) {

        String[] arr = new String[] {"My","name","is","Chakresh",
                "Kumar","Ray","from","Sultanpur","UP"};
        StringBuilder builder = new StringBuilder();
        for (String str : arr){
            builder.append(str).append(" ");
        }
        System.out.println(builder);
    }
}
