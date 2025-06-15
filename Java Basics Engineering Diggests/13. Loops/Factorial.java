public class Factorial {
    public static void main(String[] args) {

        // 6!=6*5*4*3*2*1;

     int n=5;
     int result=1;
     while (n>0){
         result=result*n;
         n--;
     }
        System.out.println(result);

    }
}
