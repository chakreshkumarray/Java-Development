package Topic9_TypeErasure;

public class Main {
    public static void main(String[] args) {

        // Before compilation in jvm
//        Box<String> stringBox = new Box();
//        stringBox.setValue("Hello");
//        String value = stringBox.getValue();


        Box stringBox = new Box();
        stringBox.setValue("Ck");
        String value = (String) stringBox.getValue();

    }
}
