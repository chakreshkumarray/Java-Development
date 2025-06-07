import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("Number is Even.."+num);
        }
        System.out.println("Number is odd..."+num);


        int age=2;
        if(age>=18){
            System.out.println("You are Adult..!");
        }
    }

}
