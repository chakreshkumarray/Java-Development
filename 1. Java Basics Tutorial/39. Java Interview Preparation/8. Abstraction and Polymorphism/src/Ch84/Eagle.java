package Ch84;

public class Eagle extends Bird{

    public Eagle(String breed) {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle are flying in the sky..");
    }

}
