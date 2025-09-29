package TernaryOperator;

import java.util.Scanner;

public class Ch56_GradeScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int marks = input.nextInt();
        String score = marks > 80 ? "High": (marks > 50 ? "Moderate": "Low");
        System.out.println("Score is: "+score);
    }
}
