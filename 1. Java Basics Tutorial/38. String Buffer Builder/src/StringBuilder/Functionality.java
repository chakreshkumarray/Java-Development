package StringBuilder;

public class Functionality {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // Append
        sb.append(" Chakresh ").append("Kumar ").append("Ray");

        // Insert
        sb.insert(0,811427854);

        // Replace
        sb.replace(0,1,"K");

        // Delete
        sb.delete(0,1);

        // Reverse
        sb.reverse();

        // CharAt
        System.out.println(sb.charAt(2));

        // Length
        System.out.println(sb.length());

        // SubString
        System.out.println(sb.substring(0,6));

        System.out.println(sb);
    }
}
