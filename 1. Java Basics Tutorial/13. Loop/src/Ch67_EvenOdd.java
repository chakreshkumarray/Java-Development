package BreakAndContinue;
import java.util.Scanner;
public class Ch67_EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1 ; i <= num; i++){
            if (i % 2 == 1){
                continue;
            }
            System.out.println("even number is : "+i);
        }

    }
}
