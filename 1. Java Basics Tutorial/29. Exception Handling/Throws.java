package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("a.text");
        fileReader.close();

    }
}
