public class Y extends X{

    void show(){
        m1();
        super.m1();
    }

    @Override
    void m1() {
        // called override of parent method
        System.out.println("I m in class Y");
    }

}
