package TwoDArray;

public class Ch50_SumOfTwoDDiagonalElement {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int primarySum = 0;    // Sum of primary diagonal
        int secondarySum = 0;  // Sum of secondary diagonal
        int n = arr.length;    // Assuming square matrix

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];           // a[i][i]
            secondarySum += arr[i][n - 1 - i]; // a[i][n-1-i]
        }
        int totalSum = primarySum + secondarySum;
        System.out.println("Sum of primary diagonal = " + primarySum);
        System.out.println("Sum of secondary diagonal = " + secondarySum);
        System.out.println("Sum of both diagonals = " + totalSum);
    }
}