package Custom_Exceptions;

public class LowBalance extends Exception{

    public LowBalance() {
        super("What do you want ? You don't have money");
    }

}
