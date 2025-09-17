public class ContinueInLoop {
    public static void main(String[] args) {

        int i=1;
        while (i<=10){
            if(i==5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }


        for (int num=1;num<=10;num++){
            if(num==5){
                continue;
            }
            System.out.println(i);

        }

        // Odd Number print
        for(int num=1;num<=20;num++){

            if(num%2==0){
                continue;
            }
            System.out.println("Odd Number "+num);
        }
    }
}
