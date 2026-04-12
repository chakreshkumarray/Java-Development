package SingletonPattern;

public class School {

    private static School instance;

    private School(){
        // private constructor
    }

    public static School getInstance(){
        if (instance == null){
            instance = new School();
        }
        return instance;
    }

}
/*
🔷 1. What is Singleton Pattern?
Singleton pattern ensures that only one object of a class is created and provides a global access point to it.

🔷 Explanation
private constructor → prevent object creation outside
static instance → single object
getInstance() → global access

Q1: What is Singleton pattern?
Ans. Ensures only one instance of a class exists
 */
