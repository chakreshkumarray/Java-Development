public class NumberIsPrime {
    public static void main(String[] args) {

        System.out.println(PrimeNumber(5));
        System.out.println(PrimeNumber(3));
        System.out.println(PrimeNumber(24));
    }

    public static boolean PrimeNumber(int number){
        /*int result=0;
        for(int i=1;i<x/2;i++){
            if(x%i==0){
                result++;
            }
        }
        return result==1;
          OR */
        for(int i = 2; i < number;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

}