public class Printf {
    public static void main(String[] args) {

        int a=2;
        int b=3;
        String c ="sum";
        char d='C';
        float e=1.2f;

        System.out.printf("Hello" + a+ " " + "hello"+"\n");
        System.out.printf(c+(a+b)+"\n");
        System.out.printf(c + " of " + a + " and " +b +" is : " +(a+b)+"\n");

        System.out.printf("%s of %d & %d is : %d\n",c,a,b,a+b);

        System.out.printf("%c & %.1f",d,e);
    }
}
