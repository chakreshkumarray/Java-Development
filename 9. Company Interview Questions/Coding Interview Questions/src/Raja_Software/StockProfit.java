package Raja_Software;

public class StockProfit {
    public static void main(String[] args) {

        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Example 1 Output: " + maxProfit(prices1));

        // Example 2
        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println("Example 2 Output: " + maxProfit(prices2));

        // Example 3
        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println("Example 3 Output: " + maxProfit(prices3));

    }

    public static int maxProfit(int[] prices){

        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}