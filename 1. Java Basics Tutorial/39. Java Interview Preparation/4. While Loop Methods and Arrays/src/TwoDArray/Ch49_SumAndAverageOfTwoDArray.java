package TwoDArray;

public class Ch49_SumAndAverageOfTwoDArray {
    public static void main(String[] args) {

        int[][] arr = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("Sum of 2D array = " + sum);
        System.out.println("Average of 2D array = " + average);
    }
}
