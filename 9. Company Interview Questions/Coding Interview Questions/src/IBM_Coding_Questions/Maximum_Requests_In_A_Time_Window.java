package IBM_Coding_Questions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maximum_Requests_In_A_Time_Window {
    public static void main(String[] args) {

        /*
        Question: Maximum Requests in a Time Window
        What it asks:
        You need to find the maximum number of requests that can fit inside a
        single time window of a specific size. The timestamps are sorted.

        Solution :
        This is a "Sliding Window" problem. We expand the window with a right
        pointer and shrink it from the left if the time difference becomes too big.
         */
        Scanner scanner = new Scanner(System.in);
        int window = scanner.nextInt();
        int n = scanner.nextInt();

        List<Integer> timestamps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            timestamps.add(scanner.nextInt());
        }

        int result = maximumRequests(window, timestamps);
        System.out.println(result);

    }

    public static int maximumRequests(int window, List<Integer> timestamps) {
        int maxRequests = 0;
        int left = 0;

        for (int right = 0; right < timestamps.size(); right++) {
            while (timestamps.get(right) - timestamps.get(left) >= window) {
                left++;
            }

            maxRequests = Math.max(maxRequests, right - left + 1);
        }

        return maxRequests;
    }
}
