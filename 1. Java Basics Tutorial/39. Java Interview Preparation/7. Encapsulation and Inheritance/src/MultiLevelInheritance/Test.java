package MultiLevelInheritance;
public class Test {
    public static void main(String[] args) {

        Child vehicle = new Child();

        Parent two = new Parent();

        GrandParent motorCycle = new GrandParent();

        vehicle.commute();
        two.commute();
        two.balance();
        motorCycle.start();

    }
}
