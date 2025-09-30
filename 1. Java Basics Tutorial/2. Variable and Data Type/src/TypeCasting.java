public class TypeCasting {
    public static void main(String[] args) {

        long big= 45;  //implicit conversion
        float dec=3;
        double de=34.4;
        System.out.println(big);
        System.out.println(dec);
        System.out.println(de);

        float eDec=(float)3.4;  //explicit conversion
        long eLong=(long)5.6;
        int eInt=(int)5.8;
        System.out.println(eDec);
        System.out.println(eLong);
        System.out.println(eInt);

        int a=10; // 4 bytes
        long b=a; // 8 bytes
        float c=a; // 4 bytes
        double d=c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        float f=1.7f;
        int g=(int) f;
        System.out.println(f);
        System.out.println(g);
    }
}
