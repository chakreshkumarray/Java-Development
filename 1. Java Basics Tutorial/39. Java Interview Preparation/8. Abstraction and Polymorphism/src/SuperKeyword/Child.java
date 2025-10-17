package SuperKeyword;

public class Child extends Parent{

    public Child(int age ,String name){ // passing parameter
        super(age,name);
        System.out.println("Ck Constructor call");
    }

    public void childMethod(){
        super.parentMethod();   // call parent method
        System.out.println("Child method call.");
    }

}
