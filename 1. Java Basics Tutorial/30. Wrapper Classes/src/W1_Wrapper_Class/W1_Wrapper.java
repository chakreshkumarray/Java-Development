package W1_Wrapper_Class;

public class W1_Wrapper {
    public static  void main(String[] args) {

        int a = 1; // primitive type stored in stack
        Integer b = 2; // object class stored in Heap

        boolean hasGraphic = true;
        Boolean hasSSD = false;

        double d = 1.5;
        Double c = 1.2;

        Float f = 1.23f;
        float g = 1.2f;

        char che = 'k';
        Character ch = 'C';

        byte by = 1;
        Byte be = 0;

        short s = 2;
        Short ss = 2;

        Long l = 122222222L;
        long ll = 121212L;

    }
}
/*
🔷 1. What are Wrapper Classes in Java?
Ans. Wrapper classes are object representations of primitive types.

🔷 2. Why do we need Wrapper Classes?
Ans. Java is object-oriented, but primitives are not objects. Wrappers are used for:
     1. Collections (Important)
     ArrayList<Integers> list = new ArrayList<>();

     Not allowed: ArrayList<int>

     2. Generics
     3. Serialization
     4. Null support
 */