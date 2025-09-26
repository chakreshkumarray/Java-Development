import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int[] arr = {16,23,54,78,99,54};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                System.out.println("Found");
            }
        }

    }
}
