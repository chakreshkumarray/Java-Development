package Topic7_GenericMethods.OverLoading;

public class OverLoad {
    public static void main(String[] args) {

        OverLoad test = new OverLoad();
        test.display(24);
        test.display("CHA");
    }

    public <T> void display(T element){           // Calls the generic display method
        System.out.println("Generic display " +element);
    }

    public void display(Integer element){       // Calls the Integer display method
        System.out.println("Integer display " +element);
    }

}
