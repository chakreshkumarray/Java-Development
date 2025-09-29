package Operator;

import java.util.Scanner;

public class Ch12_SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle: ");
        float principle = input.nextFloat();
        System.out.print("Enter time: ");
        float time = input.nextFloat();
        System.out.print("Enter ratio: ");
        float ratio = input.nextFloat();

        float simpleInterest = (principle * time * ratio)/100;

        System.out.println("Simple Interest is: "+simpleInterest);
    }
}
