import java.io.FileWriter;
import java.io.IOException;

public class Writers {
    public static void main(String[] args) {

        String fileName = "Java.txt";

        try (FileWriter writer = new FileWriter(fileName)){
            writer.write("This is java course tutorial by kgCoding ");
            writer.flush();
            System.out.println("File successfully write");
        } catch (IOException e) {
            System.out.printf("Exception occurred %s\n",e.getMessage());
            e.printStackTrace();
        }
    }
}
