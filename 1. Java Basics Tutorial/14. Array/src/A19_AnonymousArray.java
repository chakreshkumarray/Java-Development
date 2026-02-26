public class A19_AnonymousArray {
    public static void main(String[] args) {

        // This called anonymous array having no variable and no address
        // having no name
        // create and initialize at single line
        // new int[] {10,20,30,40}
        // it can be used only once
        // it can be used as an argument in method

        sum(new int[]{10,20,30,40}); // this is anonymous array
    }

    public static void sum(int[] no){

        int total = 0;
        for (int i : no){
            total = total + i;
        }
        System.out.println(total);
    }
}
