package Operator;

import java.util.Scanner;

public class Ch13_CompoundInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle: ");
        float principle = input.nextFloat();
        System.out.print("Enter Ratio: ");
        float ratio = input.nextFloat();
        System.out.print("Enter time: ");
        float time = input.nextFloat();

        double CompoundInterest = principle * Math.pow(1 + ratio / 100, time);

        System.out.println("Compound Interest is: "+CompoundInterest);
    }
}
