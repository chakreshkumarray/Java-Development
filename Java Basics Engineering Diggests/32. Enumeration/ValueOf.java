public class ValueOf {
    public static void main(String[] args) {

        try {
            ValueOfDay enums = ValueOfDay.valueOf("Monday");
            System.out.println(enums);

        }catch (IllegalArgumentException e){
            System.out.println("not valid");
        }

    }
}
