package FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
    public static void main(String[] args) {

        String fileName = "Chakresh.txt";

        try (FileWriter writer = new FileWriter(fileName)){
            writer.write("I am Chakresh from sultanpur U.P");

            int fact = 1;
            for (int i = 1; i <= 5;i++){
                fact = fact*i;
            }
            System.out.println(fact);

            writer.write(fact);
            writer.flush();
            System.out.println("File successfully write");
        } catch (IOException e) {
            System.out.printf("Exception occurred %s\n",e.getMessage());
            e.printStackTrace();
        }

    }
}
