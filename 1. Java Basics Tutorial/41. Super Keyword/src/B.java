public class B extends A{

    int i = 20;

    void show(int i){
        System.out.println(i); // Local argument scope refer variable
        System.out.println(this.i); // refer to current class of instance variable
        System.out.println(super.i); // refer to parent class of instance variable
    }

}
