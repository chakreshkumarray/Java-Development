public class V4_Character {
    public static void main(String[] args) {

        char name = 'c';
        System.out.println(name);
        System.out.println((int) java.lang.Character.MIN_VALUE);
        System.out.println((int) java.lang.Character.MAX_VALUE);

        char heart = 10084;
        System.out.println(heart);

        char HindiChar = 2309;
        System.out.println(HindiChar);

        char dil = '\u2764';
        System.out.println(dil);

        char Arrow = '\u27A4';
        System.out.println(Arrow);

        // ASCII value find
        System.out.println('A'+0);
        System.out.println('a'+0);

        // convert char into integer
        char b = 'A';
        System.out.println((int)b);

        // find char 0 to 127
        for(int i = 1; i < 128; i++){
            System.out.println((char) i);
        }
    }
}
/*
Q. What is char?
Ans. char is a primitive data type used to store a single character.
     char ch = 'A';

     Size: 2 bytes (16 bits)
     Stores Unicode characters (not just ASCII)
     Range: 0 to 65,535 (unsigned)
     Must be written inside single quotes ' '

     Java uses Unicode, so char can store:

     English letters → 'A'
     Digits → '1'
     Symbols → '@'
     Other languages → 'ह', '中'

     Example: char ch1 = 'A';
             char ch2 = 'ह';  // Hindi character

     char ch = 'A';
     System.out.println((int)ch); // 65

     char ch = 'A';
     ch = (char)(ch + 1);
     System.out.println(ch); // B
 */