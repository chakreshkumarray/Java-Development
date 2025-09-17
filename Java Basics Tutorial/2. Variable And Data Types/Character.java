public class Character {
    public static void main(String[] args) {

        char name='c';
        System.out.println(name);
        System.out.println((int) java.lang.Character.MIN_VALUE);
        System.out.println((int) java.lang.Character.MAX_VALUE);

        char heart=10084;
        System.out.println(heart);

        char HindiChar=2309;
        System.out.println(HindiChar);

        char dil='\u2764';
        System.out.println(dil);

        char Arrow='\u27A4';
        System.out.println(Arrow);

        // ASCII value find
        System.out.println('A'+0);
        System.out.println('a'+0);

        // convert char into integer
        char b='A';
        System.out.println((int)b);

        // find char 0 to 127
        for(int i=1;i<128;i++){
            System.out.println((char) i);
        }
    }
}
