public class School_SingleTun {

    public static School_SingleTun instant;     // Static Member

    private School_SingleTun(){                 // Constructor

    }

    public static School_SingleTun getInstance(){  // Instance Method
        return instant;
    }

}
