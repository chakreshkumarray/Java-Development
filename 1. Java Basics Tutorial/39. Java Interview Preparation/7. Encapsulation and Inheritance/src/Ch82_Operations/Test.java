package Ch82_Operations;
public class Test {
    public static void main(String[] args) {

        ArrayOperations opr = new ArrayOperations(new int[]{1,3,5,9});
        ArrayOperations.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());
    }
    
}
