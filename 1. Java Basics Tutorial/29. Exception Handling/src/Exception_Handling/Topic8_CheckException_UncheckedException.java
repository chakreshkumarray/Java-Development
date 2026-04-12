package Exception_Handling;

import java.io.FileReader;
import java.io.IOException;

public class Topic8_CheckException_UncheckedException {
    public static void main(String[] args){

        // Unchecked Exception
        try {
            int a = 10;
            int b = 0;

            int result = a / b; // ArithmeticException
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception handled: Cannot divide by zero");
        }

        // Checked Exception
        try {
            FileReader file = new FileReader("a.txt"); // may throw IOException
            System.out.println("File opened successfully");
            file.close();

        } catch (IOException e) {
            System.out.println("Checked Exception handled: File not found or error reading file");
        }

        System.out.println("Program completed successfully");
    }
}

/*
🔹 Unchecked Exception
ArithmeticException
Happens at runtime
Not mandatory to handle
🔹 Checked Exception
IOException
Checked at compile time
Must be handled
 */