package Topic7_GenericMethods;

public class OverLoad {
    public static void main(String[] args) {

        OverLoad test = new OverLoad();
        test.display(24);
        test.display("CHAKRESH KUMAR RAY S/O ACHCHHE LAL");
    }

    public <T> void display(T element){           // Calls the generic display method
        System.out.println("Generic display " +element);
    }

    public void display(Integer element){       // Calls the Integer display method
        System.out.println("Integer display " +element);
    }

}
