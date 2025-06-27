public class VariableNumberArgument {
    public static void main(String[] args) {

        System.out.println(sum(1,0,5,5));

    }

    public static int sum(int... a){
        int sum=0;
        for(int i:a){
            sum=sum+i;
        }
        return sum;
    }
}