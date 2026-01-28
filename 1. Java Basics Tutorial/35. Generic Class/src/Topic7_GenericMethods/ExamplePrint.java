package Topic7_GenericMethods;

public class ExamplePrint {
    public static void main(String[] args) {

       ExamplePrint test = new ExamplePrint();
       Integer[] number = {1,2,3,4,5};
       String[] str = {"CK ","AK"};

       test.PrintArray(number);
       test.PrintArray(str);



    }

    public <T> void PrintArray(T[] array){

        for (T element :array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
