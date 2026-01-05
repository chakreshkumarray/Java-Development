public class School {

    private static School school = new School();

    private School(){

    }

    private static School getInstance(){
        return school;
    }

}
