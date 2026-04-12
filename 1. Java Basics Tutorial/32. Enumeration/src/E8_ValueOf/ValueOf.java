package E8_ValueOf;

public class ValueOf {
    public static void main(String[] args) {

        try {
            Day enums = Day.valueOf("Monday");
            System.out.println(enums);

        }catch (IllegalArgumentException e){
            System.out.println("not valid");
        }

    }
}
