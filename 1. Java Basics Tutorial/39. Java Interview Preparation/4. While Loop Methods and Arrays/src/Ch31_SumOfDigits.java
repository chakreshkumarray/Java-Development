import java.util.Scanner;
public class Ch31_SumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Digits: ");
        int num = input.nextInt();

        int sum = 0;
        while (num > 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Number is :"+sum);
    }
}
