package Topic7_GenericMethods;

public class WithStatic {
    public static void main(String[] args) {

      //  WithStatic test1 = new WithStatic();
        Integer[] num = {2,4,1,6,6};
        String[] name = {"CK","AK","SK"};
        With(num);
        With(name);

    }

    public static  <T> void With(T[] array1){

        for (T element1 : array1){
            System.out.println(element1 + " ");
        }
        System.out.println();

    }

}
