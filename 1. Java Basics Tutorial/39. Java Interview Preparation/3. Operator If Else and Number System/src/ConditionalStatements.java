public class ConditionalStatements {
    public static void main(String[] args) {

        boolean isMale = true;
        boolean adult = false;
        String  string = "Ck";
        int age = 25;

        if (isMale){
            System.out.println("Yes");
        }else if (adult){
            System.out.println("name: "+string);
        }else {
            System.out.println("age: "+age);
        }
    }
}
