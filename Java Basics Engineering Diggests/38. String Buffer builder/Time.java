package StringBuffer;

public class Time {
    public static void main(String[] args) {
        long TotalStringTime = 0, TotalStringBuilderTime = 0, TotalStringBufferFTime = 0;

        for (int  j = 0; j < 1000; j++){
            long startTime , endTime;

            // Staring Test
            startTime = System.nanoTime();
            String str = "Java";
            for (int i  = 0; i < 1000; i++){
                str += "Programming";
            }
            endTime = System.nanoTime();
            TotalStringTime += (endTime - startTime);

            // String Builder Test
            startTime = System.nanoTime();
            StringBuilder sb = new StringBuilder("Java");
            for (int i  = 0; i < 1000; i++){
                sb.append( "Programming");
            }
            endTime = System.nanoTime();
            TotalStringBuilderTime += (endTime - startTime);

            // String Buffer Test
            startTime = System.nanoTime();
            StringBuffer sbf = new StringBuffer("Java");
            for (int i  = 0; i < 1000; i++){
                sbf.append("Programming");
            }
            endTime = System.nanoTime();
            TotalStringBufferFTime += (endTime - startTime);

        }

        System.out.println("Average String Time : " +(TotalStringTime / 100));
        System.out.println("Average String Builder : "+(TotalStringBuilderTime / 100));
        System.out.println("Average String Buffer Time : "+(TotalStringBufferFTime / 100));

    }
}
