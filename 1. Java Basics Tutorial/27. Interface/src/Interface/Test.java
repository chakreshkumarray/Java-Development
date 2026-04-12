package Interface;

public class Test {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();

        smartPhone.makeCall(48);
        smartPhone.endCall();
        smartPhone.takePhoto();
        smartPhone.recordVideo();
        smartPhone.PlayMusic();
        smartPhone.StopMusic();
    }
}
/*
🔷 1. What is an Interface?
An interface is a blueprint of a class that contains abstract methods (by default) and is used to achieve 100% abstraction.

🔷 2. Why Do We Need Interface?
1. Achieve Abstraction
2. Multiple Inheritance
3. Loose Coupling

Interfaces are used to achieve abstraction, support multiple inheritance, and promote loose coupling by allowing different
classes to implement the same behavior in different ways.


 */