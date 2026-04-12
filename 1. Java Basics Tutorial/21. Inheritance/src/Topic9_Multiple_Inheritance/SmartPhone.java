package Topic9_Multiple_Inheritance;

public class SmartPhone extends Camera {

    /* should be like this
     *
     public class SmartPhone extends Camera , MusicPlayer , Phone{
      }
      *
      * Multiple Inheritance does not allow its achieve by Interface
      *
      * Because of the Diamond Problem (ambiguity)
     */
}
