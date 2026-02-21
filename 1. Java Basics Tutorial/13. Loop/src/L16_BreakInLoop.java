public class L16_BreakInLoop {
    public static void main(String[] args) {

        int i = 0;
        while (i < 1000){
            System.out.println(i);
            if(i == 501){
                break;
            }
            i++;
        }
        System.out.println("ck..");



        for(int a = 1; a <= 20; a++){
            if(a == 15){
                break;
            }
            System.out.println(+a);
        }
    }
}
