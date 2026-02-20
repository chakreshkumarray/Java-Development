import java.util.Scanner;

public class C6_Marks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        if (marks >= 90){
            System.out.println("Grade A");
        }else if (marks >= 75){
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        }else {
            System.out.println("Grade D");
        }

    }
}
