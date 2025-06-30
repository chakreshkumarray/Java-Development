package Default;

class School {

    private static School instant;

    private School(){

    }

     public static School getInstance(){
        if (instant == null){
            instant = new School();
        }
        return instant;
    }

}
