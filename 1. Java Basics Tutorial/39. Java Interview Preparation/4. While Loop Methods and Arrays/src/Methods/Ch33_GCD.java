package Methods;

import java.util.Scanner;

public class Ch33_GCD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        int GCD = GCD(first,second);
        System.out.println("GCD of number:"+GCD);
    }

    public static int GCD(int num1,int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1,num2);
        while (i <= least){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int first,int second){
        if (first < second){
            return first;
        }else {
            return second;
        }
    }


}
