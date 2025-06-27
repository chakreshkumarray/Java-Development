public class Factorial {
    public static void main(String[] args) {

        System.out.println( Fact(5)); // recursive call
    }

    public static int Fact(int num){
        if(num==0){       // 5*4*3*2*1, 5*4! , n*Fact(n-1);
            return 1;
        }
        return num*Fact(num-1); // recursive call
    }
}
