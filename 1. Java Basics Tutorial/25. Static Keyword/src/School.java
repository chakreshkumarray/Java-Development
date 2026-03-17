public class School {

    /*
    -- Singleton pattern not able to create object or class of same class
    -- The Singleton pattern in Java is a creational design pattern that
    ensures a class has only one instance and provides a global point
    of access to that instance
     */
    private static School school = new School();

    private School(){

    }

    private static School getInstance(){
        return school;
    }

}
