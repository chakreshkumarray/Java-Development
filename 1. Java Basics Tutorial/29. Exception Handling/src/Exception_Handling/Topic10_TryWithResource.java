package Exception_Handling;
import java.io.FileWriter;

public class Topic10_TryWithResource {
    public static void main(String[] args) throws Exception {

        FileWriter writer = null;

        try {
            writer = new FileWriter("test.txt");
            writer.write("Hello Java");

            int x = 10 / 0; // exception occurs here

        } finally {
            if (writer != null) {
                writer.close();   // always closes file
                System.out.println("File closed safely");
            }
        }
    }

}
