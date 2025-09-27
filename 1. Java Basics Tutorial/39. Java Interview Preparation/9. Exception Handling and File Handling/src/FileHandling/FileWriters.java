package FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
    public static void main(String[] args) {

        String fileName = "Chakresh.txt";

        try (FileWriter writer = new FileWriter(fileName)){
            writer.write("I am Chakresh from sultanpur U.P");
            writer.flush();
            System.out.println("File successfully write");
        } catch (IOException e) {
            System.out.printf("Exception occurred %s\n",e.getMessage());
            e.printStackTrace();
        }

    }
}
