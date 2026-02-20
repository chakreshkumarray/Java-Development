package Methods;

import java.util.Scanner;
public class Ch32_LCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        int LCM = lcm(first,second);
        System.out.println("LCm of number:"+LCM);

    }
    public static int lcm (int first, int second){
        int i = 1;

        while (true) {
           int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }


}
