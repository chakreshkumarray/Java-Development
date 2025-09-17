package SingletonPattern;

public class School {

    private static School instant;

    private School(){  // Constructor of School class

    }

    public static School getInstance(){
        if (instant == null){
            instant = new School();
        }
        return instant;
    }

}
