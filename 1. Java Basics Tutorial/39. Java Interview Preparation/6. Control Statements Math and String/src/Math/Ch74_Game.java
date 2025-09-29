package Math;
import java.util.Scanner;
public class Ch74_Game {

    int random;

    Ch74_Game(){
        random = (int) Math.ceil(Math.random()*100);
    }

    /**
     *
     * @param guessNumber the number that player guessed
     * - @return Negative if the number is correct.
     * - Positive if the guessed number is higher
     */
    int guess(int guessNumber){
        return guessNumber -random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ch74_Game game = new Ch74_Game();
        System.out.println("Guess the number 1 to 6: ");
        int guess;
        int result;
        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0){
                System.out.println("you are guessed correct");
            }else if (result < 0){
                System.out.println("Please guess higher");
            }else {
                System.out.println("Please guess lower");
            }
        }while (result != 0);
    }
}
