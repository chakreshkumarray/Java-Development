package StringBuffer;

public class Performance {
    public static void main(String[] args) {
        long startTime, endTime;

        // Using String
        startTime = System.currentTimeMillis();
        String str = "Java";
        for (int  i = 0; i < 10000; i++){
            str += "Programming";
        }
        endTime = System.currentTimeMillis();
        System.out.println("String Time : "+(endTime - startTime) + " ms");

        // Using String Builder
        startTime = System.currentTimeMillis();
        StringBuilder sb  = new StringBuilder("Java");
        for (int  i = 0; i < 10000; i++){
            sb.append("Programming");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time : "+(endTime - startTime) + " ms");

        // Using String Buffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf  = new StringBuffer("Java");
        for (int  i = 0; i < 10000; i++){
            sbf.append(" Programming");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Time : "+(endTime - startTime) + " ms");

    }
}
