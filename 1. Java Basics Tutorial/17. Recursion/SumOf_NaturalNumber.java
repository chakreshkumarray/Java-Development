public class SumOf_NaturalNumber {
    public static void main(String[] args) {
        System.out.println(SumNatural(5));
    }

    public static int SumNatural(int num){
        if(num==1){      // 5+4+3+2+1
            return 1;
        }
        return num+SumNatural(num-1);
    }
}
