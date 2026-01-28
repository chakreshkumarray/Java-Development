package Topic10_GenericException;

public class Test {
    public static void main(String[] args) throws MyException {


       try {
           throw new MyException(123);
       } catch (MyException e) {

           System.out.println("Caught Exception " + e.getMessage());
       }

        try {
            throw new MyException("String");
        } catch (MyException e) {

            System.out.println("Caught Exception " + e.getMessage());
        }


    }
}
