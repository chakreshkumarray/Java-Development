package Ch88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter file you want to read: ");
        String fileName = input.next();

        try (FileReader reader = new FileReader(fileName)){
            int read;
            while ((read = reader.read()) != -1){
                System.out.print((char) read);
            }
        }catch (FileNotFoundException e){
            System.out.println("file not found:"+fileName);
        }
        catch (IOException e){
            System.out.println("Exception occurred :"+e.getMessage());
        }

    }
}
