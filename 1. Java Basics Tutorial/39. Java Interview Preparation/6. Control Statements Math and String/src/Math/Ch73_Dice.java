package Math;
public class Ch73_Dice {

    int roll(){
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {

        Ch73_Dice dice = new Ch73_Dice();
        for (int i = 0; i < 100; i++){
            System.out.println(dice.roll());
        }
    }
}
