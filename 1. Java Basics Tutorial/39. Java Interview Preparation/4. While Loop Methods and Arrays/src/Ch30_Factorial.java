import java.util.Scanner;
public class Ch30_Factorial {
    public static void main(String[] args) {

        System.out.println(Fact(5));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();

        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial is :"+fact);
    }

    public static int Fact(int num){
        if (num < 2){
            return 1;
        }
        return num*Fact(num-1);
    }


}
