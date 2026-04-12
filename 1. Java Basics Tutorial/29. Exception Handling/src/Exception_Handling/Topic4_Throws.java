package Exception_Handling;
import java.io.FileReader;
import java.io.IOException;

public class Topic4_Throws {
    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader("a.txt")) {
            System.out.println("File opened");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
