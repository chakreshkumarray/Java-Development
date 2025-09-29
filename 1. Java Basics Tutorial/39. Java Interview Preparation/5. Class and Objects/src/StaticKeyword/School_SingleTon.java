package StaticKeyword;

public class School_SingleTon {

    public static School_SingleTon instant;     // Static Member

    private School_SingleTon(){                 // Constructor

    }

    public static School_SingleTon getInstance(){  // Instance Method
        return instant;
    }

}
