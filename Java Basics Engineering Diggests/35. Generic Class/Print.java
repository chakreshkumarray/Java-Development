package Topic7_GenericMethods.Example;

public class Print {
    public static void main(String[] args) {

       Print test = new Print();
       Integer[] number = {1,2,3,4,5};
       String[] str = {"CK ","AK"};

       test.PrintArray(number);
       test.PrintArray(str);



    }

    public <T> void PrintArray(T[] array){

        for (T element :array){
            System.out.println(element + " ");
        }
        System.out.println();
    }

}
