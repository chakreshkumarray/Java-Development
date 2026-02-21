import java.util.Scanner;

public class L32_LCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int max = (first > second) ? first : second;

        int lcm = max;

        while (true){
            if (lcm % first == 0 && lcm % second == 0){
                System.out.println("LCM: "+lcm);
                break;
            }
            lcm += max;
        }

    }
}
