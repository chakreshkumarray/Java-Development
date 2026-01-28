package Topic6_GenericConstructor;

public class MultipleTPConstructor {

    public <T extends Number > MultipleTPConstructor(T value){

    }




    public static void main(String[] args) {
        MultipleTPConstructor box2 = new MultipleTPConstructor(2);
        System.out.println(box2);
    }
}
