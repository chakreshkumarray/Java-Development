package Methods;

import java.util.Scanner;
public class Ch30_Factorial {
    public static void main(String[] args) {

        fact();
        System.out.println(Fact(5));
        System.out.println(factorial(5));
    }

    public static void fact(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
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

    public static int factorial(int num){

        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact = fact*i;
        }
        return fact;
    }

}
