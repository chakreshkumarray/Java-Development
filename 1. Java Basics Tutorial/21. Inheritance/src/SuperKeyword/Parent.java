package SuperKeyword;

public class Parent extends GrandParent{

    public Parent(int age , String name){
        super(age,name);
        System.out.println("Achchhe Lal Constructor call");
    }

    public void parentMethod(){
        System.out.println("Parent Method Call");
    }

}
