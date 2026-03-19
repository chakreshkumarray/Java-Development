package Composition;

public class Car {

    /*
    Composition is Strong coupling --> hard coupling

    Car depends upon Engine --> Without engine car can not run
     */

    public void Engine(){
        System.out.println("Start engine");
    }

}
